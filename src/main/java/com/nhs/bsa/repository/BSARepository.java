package com.nhs.bsa.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.nhs.bsa.entity.RegularAmount;

/**
 * @author suleyman.yildirim
 *
 */
@Repository
public class BSARepository {
	private List<RegularAmount> bsaAmounts = new LinkedList<>();

	public void save(RegularAmount amount) {
		bsaAmounts.add(amount);
	}

	Optional<RegularAmount> findByAmount(String amount) {
		return bsaAmounts.stream().filter(user -> user.getAmount().equals(amount)).findAny();
	}
}
