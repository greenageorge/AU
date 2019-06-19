create database moviedb;
use moviedb;
create table screen(screen_no int primary key auto_increment,no_of_seats int);
create table movie( movie_id int primary key auto_increment, movie_name varchar(10), genre varchar(10), duration time);
create table shows(show_id int primary key auto_increment, movie_id int, show_time time, show_date date, screen_no int, foreign key(movie_id) references movie(movie_id), 
foreign key(screen_no) references screen(screen_no));
create table ticket(ticket_id int primary key auto_increment, 
customer_name varchar(10), show_id int, no_of_tickets int, price numeric(4,2), foreign key(show_id) references shows(show_id));
show tables;
insert into screen (no_of_seats) values(250);
insert into screen (no_of_seats) values(500);
insert into screen (no_of_seats) values (700);
insert into movie(movie_name, genre, duration) values ("avengers","thriller","03:00:00");
insert into movie(movie_name, genre, duration) values ("frozen","children","02:00:00");
insert into movie(movie_name, genre, duration) values ("Annabelle","horror","02:20:00");
select * from movie;
insert into shows (movie_id, show_time, show_date, screen_no) values(1,"09:00:00","2019-04-01",1);
insert into shows (movie_id, show_time, show_date, screen_no) values(1,"01:00:00","2019-04-01",2);
insert into shows (movie_id, show_time, show_date, screen_no) values(2,"09:00:00","2019-04-01",3);
insert into shows (movie_id, show_time, show_date, screen_no) values(3,"09:00:00","2019-04-01",2);
insert into shows (movie_id, show_time, show_date, screen_no) values(2,"19:00:00","2019-04-01",1);
select* from shows;
create trigger ticket_price 
before INSERT 
on 
ticket
for each row 
set new.price = new.no_of_tickets * 150;
alter table ticket modify column price numeric(6,2);
insert into ticket(customer_name, show_id, no_of_tickets) values("Ron",1,2);
delete from ticket;
alter table ticket add screen_no int;
alter table ticket add foreign key(screen_no) references screen(screen_no);
insert into ticket(customer_name, show_id, no_of_tickets,screen_no) values("Meena",1,2,3);
select* from screen;
create trigger change_no_of_seat 
after INSERT 
on 
ticket
for each row 
update screen set no_of_seats = no_of_seats-new.no_of_tickets where screen.screen_no=new.screen_no;
DELIMITER //
create procedure view_booking_details(in ticketid int)
begin
select* from ticket where ticket_id= ticketid;
end //
DELIMITER ;
 call view_booking_details(18);
DELIMITER //
create procedure ticket_booking( 
IN customername VARCHAR(10),  
IN showid INT,
IN nooftickets INT,
screenno int
)
begin
insert into ticket(customer_name, show_id, no_of_tickets,screen_no) values(customername, showid, nooftickets,screenno);
end //
DELIMITER ;
call ticket_booking("Bronn",1,3,3);
select * from ticket;