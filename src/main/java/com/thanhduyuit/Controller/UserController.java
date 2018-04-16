package com.thanhduyuit.Controller;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thanhduyuit.DAO.GoodDao;
import com.thanhduyuit.DAO.GoodTypeDao;
import com.thanhduyuit.DAO.UserDao;
import com.thanhduyuit.Service.Message;
import com.thanhduyuit.entities.Good;
import com.thanhduyuit.entities.GoodType;
import com.thanhduyuit.entities.User;

@Controller
public class UserController {

	// ------------------------
	// PUBLIC METHODS
	// ------------------------

	/**
	 * /create --> Create a new user and save it in the database.
	 * 
	 * @param email
	 *            User's email
	 * @param name
	 *            User's name
	 * @return A string describing if the user is successfully created or not.
	 */

	@RequestMapping("/create")
	@ResponseBody
	public String create(String email, String name) {
		User user = null;
		try {
			user = new User(email, name);
			userDao.save(user);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created! (id = " + user.getId() + ")";
	}

	@RequestMapping("/createGood")
	@ResponseBody
	public String createGood(String name, String type, String code, String unit, String price) throws Exception {
		if (name.equalsIgnoreCase("undefined") || type.equalsIgnoreCase("undefined")
				|| code.equalsIgnoreCase("undefined") || unit.equalsIgnoreCase("undefined")
				|| price.equalsIgnoreCase("undefined")) {
			throw new Exception("Invalid data");
		}
		Good good = null;
		double priceDouble = Double.parseDouble(price);

		try {
			good = new Good(name, type, code, unit, priceDouble);
			goodDao.save(good);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created! (id = " + good.getId() + ")";
	}

	@RequestMapping("/createGoodType")
	@ResponseBody
	public Message createGoodType(String name, String code, String description) throws Exception {
		if (name.equalsIgnoreCase("undefined") || code.equalsIgnoreCase("undefined")
				|| description.equalsIgnoreCase("undefined")) {
			throw new Exception("Invalid data");
		}
		GoodType goodType = null;
		Message message= null;
		try {
			goodType = new GoodType(name, code, description);
			goodTypeDao.save(goodType);
			
			message = new Message("401", "Failed");
		} catch (Exception ex) {
			return null;
		}
		System.out.println("User succesfully created! (id = " + goodType.getId() + ")"); 
		return message;
	}

	/**
	 * /delete --> Delete the user having the passed id.
	 * 
	 * @param id
	 *            The id of the user to delete
	 * @return A string describing if the user is successfully deleted or not.
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id) {
		try {
			User user = new User(id);
			userDao.delete(user);
		} catch (Exception ex) {
			return "Error deleting the user: " + ex.toString();
		}
		return "User successfully deleted!";
	}

	/**
	 * /get-by-email --> Return the id for the user having the passed email.
	 * 
	 * @param email
	 *            The email to search in the database.
	 * @return The user id or a message error if the user is not found.
	 */
	@RequestMapping("/get-by-email")
	@ResponseBody
	public String getByEmail(String email) {
		String userId;
		try {
			User user = userDao.findByEmail(email);
			userId = String.valueOf(user.getId());
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + userId;
	}

	/**
	 * /update --> Update the email and the name for the user in the database having
	 * the passed id.
	 * 
	 * @param id
	 *            The id for the user to update.
	 * @param email
	 *            The new email.
	 * @param name
	 *            The new name.
	 * @return A string describing if the user is successfully updated or not.
	 */
	// @RequestMapping("/update")
	// @ResponseBody
	// public String updateUser(long id, String email, String name) {
	// try {
	// User user = userDao.findOne(id);
	// user.setEmail(email);
	// user.setName(name);
	// userDao.save(user);
	// }
	// catch (Exception ex) {
	// return "Error updating the user: " + ex.toString();
	// }
	// return "User successfully updated!";
	// }

	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Autowired
	private UserDao userDao;

	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodTypeDao goodTypeDao;

} // class UserController
