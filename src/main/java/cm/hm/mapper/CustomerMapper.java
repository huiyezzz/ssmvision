package cm.hm.mapper;

import cm.hm.po.Customer;

import java.util.List;

/**
 * Created by HUIYE on 2017/12/6.
 */
public interface CustomerMapper {
    List<Customer> selectAll();
    void insert(Customer customer);
    void delete(String id);
    void update(Customer customer);
    Customer selectById(int id);

}
