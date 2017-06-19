create database RESTSpring;

CREATE TABLE jobs (
  id int(11) NOT NULL AUTO_INCREMENT,
  title varchar(45) DEFAULT NULL,
  location varchar(45) DEFAULT NULL,
  description varchar(255) DEFAULT NULL,
  company varchar(45) DEFAULT NULL,
  Salary varchar(45) DEFAULT NULL,
  skills_id int(11) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

INSERT INTO `RESTSpring`.`jobs` (`id`, `title`, `location`, `description`, `company`) VALUES ('1', 'Full Sack Developer', 'hyderabad', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor ', 'Shortlist Professional');
INSERT INTO `RESTSpring`.`jobs` (`id`, `title`, `location`, `description`, `company`) VALUES ('2', 'Java Developer', 'coimbatore', 'Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor ', 'Paypal');
