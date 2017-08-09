import java.util.Random;

public class Vega implements Vehicle {
	
	private Random rand = new Random();
	private boolean running = false;
	private int location = 0;
	private boolean dirty = true;

	public boolean isDirty() {
		return this.dirty;
	}

	public boolean isStarted() {
		return this.running;
	}

	public int getLocation() {
		return this.location;
	}

	public void setDirty(boolean dirt) {
		if (this.location != 200) {
			System.out.println("You can only wash me at the carwash");
		} else {
			if (!dirt && this.rand.nextInt(5) == 1) {
				this.dirty = false;
			} else {
				System.out.println("Still dirty");
			}

		}
	}

	public void start() {
		if (this.rand.nextInt(5) == 1) {
			this.running = true;
		} else {
			System.out.println("Still not running");
		}

	}

	public void stop() {
		if (this.rand.nextInt(5) == 1) {
			this.running = false;
		} else {
			System.out.println("Still running");
		}

	}

	public void moveTo(int location) {
		if (!this.running) {
			System.out.println("Motor is not running");
		} else if (this.rand.nextInt(5) == 0) {
			this.location = location;
		} else {
			this.running = false;

			do {
				this.location = this.rand.nextInt(100);
			} while (this.location == location);

			System.out.println("Motor died");
		}
	}
}