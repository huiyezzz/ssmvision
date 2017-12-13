package cm.hm.mapper;

import cm.hm.po.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HUIYE on 2017/12/6.
 */
@Component
public interface CustomerMapper {
    List<Customer> selectAll();
    void insert(Customer customer);
    void delete(String id);
    void update(Customer customer);
    Customer selectById(int id);
    List<Customer> selectByName(String name);

}
