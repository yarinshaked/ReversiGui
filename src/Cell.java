import javafx.scene.control.Button;

public class Cell extends Button {
    private int status;
    private Location spot;

    public Cell() {
        this.status = 0;
        spot = new Location(0, 0);
    }

    public int getStatus() {
        return this.status;
    }

    public void updateStatus(int status) {
        this.status = status;
    }

    public void setSpot(int row, int col) {
        this.spot = new Location(row, col);
    }
}
