package com.potsoft.cart2api.repository.pay;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.pay.PayTransaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;

@Repository
public interface PayTransactionRepository extends JpaRepository<PayTransaction, Long> 
{
  Optional<PayTransaction> findByPayTransactionId(@NotNull Long pay_transaction_id);

  @Transactional
  default PayTransaction loadByPayTransactionId(@NotNull Long pay_transaction_id)
  {
    return findByPayTransactionId(pay_transaction_id)
    .orElseThrow(() ->
    new ResourceNotFoundException("PayTransaction", 
                                  "pay_transaction_id", pay_transaction_id));
  }

}
