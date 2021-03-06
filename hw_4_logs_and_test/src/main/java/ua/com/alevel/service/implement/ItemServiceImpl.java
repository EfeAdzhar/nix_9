package ua.com.alevel.service.implement.;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.alevel.config.ActiveClass;
import ua.com.alevel.config.GenerateImpl;
import ua.com.alevel.dao.ItemDao;
import ua.com.alevel.entity.Items;
import ua.com.alevel.service.ItemService;

@ActiveClass
public class ItemServiceImpl implements ItemService {

    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("INFO");
    private static final Logger LOGGER_WARN = LoggerFactory.getLogger("WARN");
    private static final Logger LOGGER_ERROR = LoggerFactory.getLogger("ERROR");

    private final ItemDao itemDao = GenerateImpl.generateImplementation(ItemDao.class);

    @Override
    public void create(Items item) {
        LOGGER_INFO.info("operation: create, status: start, type: " + item);
        try {
            itemDao.create(item);
            LOGGER_INFO.info("operation: create, status: finish, type: " + item);
        } catch (RuntimeException e) {
            LOGGER_ERROR.error("operation: create, status: failed, type: " + item);
        }
    }

    @Override
    public void update(Items item) {
        try {
            LOGGER_INFO.info("operation: update, status: start, type: " + item);
            itemDao.update(item);
            LOGGER_INFO.info("operation: update, status: finish, type: " + item);
        } catch (RuntimeException e) {
            LOGGER_ERROR.error("operation: update, status: failed, type: " + item);
        }
    }

    @Override
    public void delete(String id) {
        try {
            LOGGER_WARN.warn("operation: delete, status: start, id:" + id);
            itemDao.delete(id);
            LOGGER_WARN.warn("operation: delete, status: finish, id:" + id);
        } catch (RuntimeException e) {
            LOGGER_ERROR.error("operation: delete, status: failed, id:" + id);
        }
    }

    @Override
    public Items findById(String id) {
        LOGGER_INFO.info("operation: findById, status: start, id:" + id);
        return itemDao.findById(id);
    }

    @Override
    public Items[] findAll() {
        LOGGER_INFO.info("operation: findAll, status: start");
        return itemDao.findAll();
    }

}