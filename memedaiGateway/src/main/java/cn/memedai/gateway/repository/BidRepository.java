package cn.memedai.gateway.repository;

import cn.memedai.gateway.domain.bid.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dell on 14-6-4.
 */
public interface BidRepository extends JpaRepository<Bid, Long> {
}
