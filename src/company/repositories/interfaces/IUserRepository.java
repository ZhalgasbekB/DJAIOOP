package company.repositories.interfaces;


import Market.Product;
import company.entities.*;

import java.util.List;

public interface IUserRepository {
    boolean createUser(User user);
    User getUser(int id);
    List<User> getAllUsers();


}
