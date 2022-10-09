package business;

import dataAccess.IntructorDao;
import entities.Instructor;
import logging.Logger;

public class InstructorManager {
	private IntructorDao intructorDao;
	private Logger[] loggers;

	public InstructorManager(IntructorDao intructorDao, Logger[] loggers) {
		this.intructorDao = intructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		intructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

}
