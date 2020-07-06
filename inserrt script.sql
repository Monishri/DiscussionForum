select * from qanda.user;
delete from user where u_id = 1;
INSERT INTO `qanda`.`user` (`u_id`, `u_name`, `u_fname`, `u_lname`, `u_email`, `u_pwd`) VALUES ('1', 'raj', 'raju', 'k', 'raj@gmail.com', '$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');
INSERT INTO `qanda`.`user` (`u_id`, `u_name`, `u_fname`, `u_lname`, `u_email`, `u_pwd`) VALUES ('2', 'raji', 'rajeswari', 'l', 'raji@gmail.com', '$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');
INSERT INTO `qanda`.`user` (`u_id`, `u_name`, `u_fname`, `u_lname`, `u_email`, `u_pwd`) VALUES ('3', 'amy', 'amyl', 'm', 'amy@gmail.com', '$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');
INSERT INTO `qanda`.`user` (`u_id`, `u_name`, `u_fname`, `u_lname`, `u_email`,`u_pwd`) VALUES ('4', 'kanna', 'kannan', 's', 'kanna@gmail.com','$2a$10$R/lZJuT9skteNmAku9Y7aeutxbOKstD5xE5bHOf74M2PHZipyt3yK');



select * from qanda.question;

INSERT INTO `qanda`.`question` (`q_id`, `q_title`, `q_tags`, `q_desc`, `user_u_id`) VALUES ('1', 'life', 'tag', 'What is life ?', '2');
INSERT INTO `qanda`.`question` (`q_id`, `q_title`, `q_tags`, `q_desc`, `user_u_id`) VALUES ('2', 'life', 'tag', 'What is happiness ?', '3');
INSERT INTO `qanda`.`question` (`q_id`, `q_title`, `q_tags`, `q_desc`,`user_u_id`) VALUES ('3', 'life', 'tag', 'What to do to successed in life ?', '1');

select * from answer;

INSERT INTO `qanda`.`answer` (`a_id`, `a_desc`, `user_u_id`, `question_q_id`) VALUES ('1', 'life is to live', '2', '1');
INSERT INTO `qanda`.`answer` (`a_id`, `a_desc`, `user_u_id`, `question_q_id`) VALUES ('2', 'life is a puzzle', '3', '1');
INSERT INTO `qanda`.`answer` (`a_id`, `a_desc`, `user_u_id`, `question_q_id`) VALUES ('3', 'happiness is within', '1', '2');
INSERT INTO `qanda`.`answer` (`a_id`, `a_desc`, `user_u_id`, `question_q_id`) VALUES ('4', 'do what you like', '4', '3');


