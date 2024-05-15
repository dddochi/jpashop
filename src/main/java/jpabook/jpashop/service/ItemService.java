package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public void saveItem(Item item){
        itemRepository.save(item);
    }

    //변경감지 기능 사용
    @Transactional
    public void updateItem(Long itemId, String name, int price, int stockQuantity){
        Item findItem = itemRepository.findOne(itemId); // findOne으로 찾아왔기 때문에 얘는 영속성 상태!
        //값만 세팅해주면 되고, 따로 save()호출 안해도 JPA가 자동으로 db에 반영
        //코드가 다 끝나고, @Transactional에 의해 commit이 된다! -> JPA는 flush를 날 -> 변경된 애를 다 찾아서 업데이트 db에 날림
        findItem.setName(name);
        findItem.setPrice(price);
        findItem.setStockQuantity(stockQuantity);
    }

    public List<Item> findItems(){
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId){
        return itemRepository.findOne(itemId);
    }
}
