import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Interface extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JButton bt1 = new JButton("Imagem 1");//Os 3 botões necessários para a execução
	JButton bt2 = new JButton("Imagem 2");
	JButton bt3 = new JButton("Imagem 3");
	ImageIcon perguntei = new ImageIcon("C:\\Users\\erick\\Downloads\\perguntei.jpeg");//As 3 imagens que eu utilizei kkkkkkkk
	ImageIcon depende = new ImageIcon("C:\\Users\\erick\\Downloads\\depende.jpeg");//	 meudeus pq eu sou assim
	ImageIcon amongos = new ImageIcon("C:\\Users\\erick\\Downloads\\amongos.jpeg");//	 pelo menos ri dms KKKKKKKKKKK 
	
	JLabel lb1, lb2, lb3;//Labels que carregarão as imagens
	
	//Variáveis que lêem a imagem automaticamente e retornam a sua cor
			BufferedImage im1 = ImageIO.read(new File("C:\\Users\\erick\\Downloads\\perguntei.jpeg"));
			Color cor1 = new Color(im1.getRGB(60, 122));
			BufferedImage im2 = ImageIO.read(new File("C:\\Users\\erick\\Downloads\\depende.jpeg"));
			Color cor2 = new Color(im2.getRGB(153, 46));
			BufferedImage im3 = ImageIO.read(new File("C:\\Users\\erick\\Downloads\\amongos.jpeg"));
			Color cor3 = new Color(im3.getRGB(102, 108));
	
	public Interface() throws IOException {
		setTitle("Aula 12: Interface Gráfica");//Setando os parâmetros da janela
		setSize(1280, 720);//Tamanho
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Ação ao clicar em Exit
		setLocationRelativeTo(null);//Sei não papo retokkkk botei aqui só de zoas
		setVisible(true);//Se a a janela é visível ou nãos
		setLayout(null);
		
		add(bt1);//Adicionando e setando os parâmetros dos botões
		bt1.addActionListener(this);
		bt1.setBounds(80, 500, 100, 65);
		add(bt2);
		bt2.addActionListener(this);
		bt2.setBounds(580, 500, 100, 65);
		add(bt3);
		bt3.addActionListener(this);
		bt3.setBounds(1080, 500, 100, 65);
		
		lb1 = new JLabel(perguntei);//Novamente os 3 labels
		lb2 = new JLabel(depende);
		lb3 = new JLabel(amongos);
		add(lb1);//Adicionar os Labels
		add(lb2);
		add(lb3);
		lb1.setBounds(40, 200, 200, 252);//Parâmetros dos Labels
		lb2.setBounds(530, 200, 201, 200);
		lb3.setBounds(1030, 200, 200, 199);
		
		}
	public void actionPerformed(ActionEvent e) { //Eventos ao clicar no botão
		if(e.getSource() == bt1) {
			getContentPane().setBackground(cor1);
		}else if(e.getSource() == bt2) {
			getContentPane().setBackground(cor2);
		}else if(e.getSource() == bt3) {
			getContentPane().setBackground(cor3);
		}
	}

	public static void main(String[] args) throws IOException { //Classe principal
		new Interface(); // Instanciar todo o código utilizado
		
	}
}