package cn.memedai.gateway.domain.shoppingcart;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Created by dell on 14-7-18.
 */
public class ScheduledShoppingCartListener implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("Message Received on channel " + message.getChannel() + " message :: " + message.toString());
    }
}
