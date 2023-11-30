package testAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Algorithm.Trainer;

class TrainerTest {

	@Test
	void test() {
		Trainer trainer = new Trainer();
		trainer.trainParameters();
	}

}
