package br.com.leo.Classes;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener{

	JFrame frame = new JFrame();
	JPanel cadastro = new JPanel();
	JPanel telaInicial = new JPanel();
	Aluno usuarioCadastrado;
	JPanel admin = new JPanel();
	JPanel panel = new JPanel();
	JTextField usuarioTextbox = new JTextField();
	JTextField senhaTextbox = new JTextField();
	JPanel materias = new JPanel();
	JPanel notas = new JPanel();
	JPanel perfil = new JPanel();



	

	public void criarPainel(){

		
		panel.setBorder(BorderFactory.createEmptyBorder(240,240,60,240));
		panel.setLayout(new GridLayout(0,1));
		
		JLabel bemvindoLabel = new JLabel("BEM VINDO!");
		panel.add(bemvindoLabel);
		JLabel loginLabel = new JLabel("Usuario:");
		panel.add(loginLabel);
		panel.add(usuarioTextbox);
		JLabel senhaLabel = new JLabel("Senha:");
		panel.add(senhaLabel);
		panel.add(senhaTextbox);
		JButton entraButton = new JButton("ENTRA");
		panel.add(entraButton);
		entraButton.addActionListener(
				new ActionListener() { public void actionPerformed(ActionEvent e) {
					if(usuarioTextbox.getText().equals("admin") && senhaTextbox.getText().equals("admin")){
						System.out.println("OK, administrador  reconhecido.");
						frame.add(admin, BorderLayout.CENTER);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setTitle("ADMIN");
						frame.pack();
						frame.setVisible(true);
						panel.setVisible(false);
						createTelaAdmin();
						
					}
					
				}}
				);
		JLabel criarusuarioLabel = new JLabel("Criar novo usuario?");
		JButton sim = new JButton("SIM");
		JButton nao = new JButton("NAO");
		sim.addActionListener(
				new ActionListener() { public void actionPerformed(ActionEvent e) {
					createCadastro();
					frame.add(cadastro, BorderLayout.CENTER);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setTitle("Cadastro");
					frame.pack();
					frame.setVisible(true);
					panel.setVisible(false);	
				}});
		panel.add(criarusuarioLabel);
		panel.add(sim);
		panel.add(nao);

		

	}
	
	public void createPerfil(){
		JLabel nome = new JLabel("Nome: " + usuarioCadastrado.getNome());
		JLabel nascimento = new JLabel("Data de nascimento: " + usuarioCadastrado.getNascimento());
		JLabel cpf = new JLabel("Nome: " + usuarioCadastrado.getCpf());
		JLabel email = new JLabel("Email: " + usuarioCadastrado.getEmail());
		JLabel espaco = new JLabel(" ");
		JButton voltarButton = new JButton("Voltar para tela inicial");
		voltarButton.addActionListener(
				new ActionListener() { public void actionPerformed(ActionEvent e) {
					telaInicial.setVisible(true);
					frame.add(telaInicial, BorderLayout.CENTER);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setTitle("Tela Inicial");
					frame.pack();
					frame.setVisible(true);
					perfil.setVisible(false);
				}});
		
		
		perfil.add(nome);
		perfil.add(espaco);
		perfil.add(nascimento);
		perfil.add(espaco);
		perfil.add(email);
		perfil.add(espaco);
		perfil.add(cpf);
		perfil.add(voltarButton);

		
		
		
	}
	
	public void createNotas(){
		JLabel texto = new JLabel("Suas notas são:");
		JLabel espaco = new JLabel(" ");
		JLabel notaPortugues = new JLabel("Portugues: " + usuarioCadastrado.getNotaPortugues());
		JLabel notaMatematica = new JLabel("Matemática: " + usuarioCadastrado.getNotaMatematica());
		JLabel notaGeografia = new JLabel("Geografia: " + usuarioCadastrado.getNotaGeografia());
		JButton voltarButton = new JButton("Voltar para tela inicial");
		voltarButton.addActionListener(
				new ActionListener() { public void actionPerformed(ActionEvent e) {
					telaInicial.setVisible(true);
					frame.add(telaInicial, BorderLayout.CENTER);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setTitle("Tela Inicial");
					frame.pack();
					frame.setVisible(true);
					notas.setVisible(false);
				}});
		
		notas.add(texto);
		notas.add(espaco);
		notas.add(notaPortugues);
		notas.add(notaMatematica);
		notas.add(notaGeografia);
		notas.add(voltarButton);
		
		
		

	}

	public GUI(){		
		criarPainel();
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tela de inicio");
		frame.pack();
		frame.setVisible(true);

}


	public void createTelaAdmin(){
		
	}

	
public void createTelaInicial(){
	JLabel bemVindo = new JLabel("Bem vindo, " + usuarioCadastrado.getNome() + "!" );
	telaInicial.add(bemVindo);
	
	JButton perfilButton = new JButton("PERFIL");
	telaInicial.add(perfilButton);
	perfilButton.addActionListener(
			new ActionListener() { public void actionPerformed(ActionEvent e) {
				createPerfil();
				frame.add(perfil, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("PERFIL");
				frame.pack();
				frame.setVisible(true);
				telaInicial.setVisible(false);
			}});
	JButton materiasButton = new JButton("MATERIAS");
	telaInicial.add(materiasButton);
	JButton notasJButton = new JButton("NOTAS");
	telaInicial.add(notasJButton);
	
	notasJButton.addActionListener(
			new ActionListener() { public void actionPerformed(ActionEvent e) {
				createNotas();
				frame.add(notas, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("NOTAS");
				frame.pack();
				frame.setVisible(true);
				telaInicial.setVisible(false);
				
			}});
	
	JButton sairButton = new JButton("SAIR");
	telaInicial.add(sairButton);
	
	sairButton.addActionListener(
			new ActionListener() { public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
				
				frame.add(panel, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Tela Inicial");
				frame.pack();
				frame.setVisible(true);
				telaInicial.setVisible(false);

			}});
			

	
	

}



public void createCadastro(){
	
	cadastro.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
	cadastro.setLayout(new GridLayout(0,1));
	
	JLabel usuarioLabel = new JLabel("Nome de usuario:");
	JTextField usuarioTextbox = new JTextField();
	JLabel cpfLabel = new JLabel("CPF");
	JTextField cpfTextbox = new JTextField("ex: XXX.XXX.XXX-XX");
	JLabel nascimentoLabel = new JLabel("Data de nascimento:");
	JTextField nascimentoTextbox = new JTextField("ex: XX/XX/XXXX");
	JLabel emailLabel = new JLabel("Email:");
	JTextField emailTextbox = new JTextField();
	JLabel senhaLabel = new JLabel("Senha:");
	JTextField senhaTextbox = new JTextField();
	JLabel espacoLabel = new JLabel("            ");

	cadastro.add(usuarioLabel);
	cadastro.add(usuarioTextbox);
	cadastro.add(cpfLabel);
	cadastro.add(cpfTextbox);
	cadastro.add(nascimentoLabel);
	cadastro.add(nascimentoTextbox);
	cadastro.add(emailLabel);
	cadastro.add(emailTextbox);
	cadastro.add(senhaLabel);
	cadastro.add(senhaTextbox);
	cadastro.add(espacoLabel);
	
	JButton confirma = new JButton("CONFIRMA");
	cadastro.add(confirma);
	
	try{
	confirma.addActionListener(
			new ActionListener() { public void actionPerformed(ActionEvent e) {
				if(usuarioTextbox.getText().length() >10 && cpfTextbox.getText().length() >10 && nascimentoTextbox.getText().length() >10 && emailTextbox.getText().length() >10 && senhaTextbox.getText().length() >10){
			    Aluno usuario = new Aluno(usuarioTextbox.getText(), cpfTextbox.getText(), nascimentoTextbox.getText(), emailTextbox.getText(), senhaTextbox.getText());
				usuarioCadastrado = usuario;
			    System.out.println(usuario);
				createTelaInicial();
				frame.add(telaInicial, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setTitle("Tela Inicial");
				frame.pack();
				frame.setVisible(true);
				cadastro.setVisible(false);
				}
				else{
					throw new dadosinvalidosException("Digite dados maiores que 10 caracteres");
				}
			    }
			  }
			);	
	}
	catch(dadosinvalidosException ex){
		System.out.println(ex.getMessage());
	}
}

@Override
public void actionPerformed(ActionEvent arg0) {
}
}


