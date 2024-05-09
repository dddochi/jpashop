//package jpabook.jpashop.service;
//
//import jakarta.persistence.EntityManager;
//import jpabook.jpashop.domain.item.Album;
//import jpabook.jpashop.domain.item.Item;
//import jpabook.jpashop.repository.ItemRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
////@Rollback(value = false)
//public class ItemServiceTest {
//    @Autowired
//    private ItemRepository itemRepository;
//    @Autowired
//    private ItemService itemService;
//
//    @Autowired
//    private EntityManager em;
//
//    //item 등록
//    @Test
//    public void 상품_등록(){
//        //given
//        Item item = new Album();
//        item.setId(1L);
//
//        //when
//        itemRepository.save(item);
//        em.flush();
////        em.clear();
//
//        //then
//        Item findItem = itemRepository.findOne(1L);
//        Assertions.assertThat(item).isEqualTo(findItem);
//    }
//    //item 조회
//}