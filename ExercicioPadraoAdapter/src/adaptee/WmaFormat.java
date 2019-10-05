package adaptee;

public interface WmaFormat {
	
	public void setFile(String arquivo);

	public void open();

	public void setLocation(int posicao);

	public void play();

	public void stop();
}
