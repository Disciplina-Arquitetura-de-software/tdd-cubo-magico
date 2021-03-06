package br.edu.ifrn.diatinf.cubo.entities;

public class BuilderCuboMagico3x3 {
	public CuboMagico cubo;
	
	public CuboMagico build() {
		cubo = new CuboMagico();
		return cubo;
	}

	public PecaFace buildPecaFace(Cor cor) {
		PecaFace face = new PecaFace();
		face.cor = cor;
		return face;
	}

	public Peca buildPecaCentral(Cor cor) {
		Peca p = new Peca();
		p.faces = new PecaFace[1];
		p.faces[0] = this.buildPecaFace(cor);
		p.faces[0].peca = p;
		return p;
	}

	public Peca buildPecaLateral(Cor cor1, Cor cor2) {
		Peca p = new Peca();
		p.faces = new PecaFace[2];
		p.faces[0] = this.buildPecaFace(cor1);
		p.faces[1]=this.buildPecaFace(cor2);
		p.faces[0].peca = p;
		p.faces[1].peca = p;
		return p;
	}

	public Peca buildPecaQuina(Cor vermelho, Cor azul, Cor verde) {
		Peca p = new Peca();
		p.faces = new PecaFace[3];
		p.faces[0] = this.buildPecaFace(vermelho);
		p.faces[1] = this.buildPecaFace(azul);
		p.faces[2] = this.buildPecaFace(verde);
		p.faces[0].peca = p;
		p.faces[1].peca = p;
		p.faces[2].peca = p;
		return p;
	}

	public Face buildFace(Cor cor) {
		Face face = new Face();
		face.pecasFaces = new PecaFace[9];
		face.nome=cor;
		
		for (int i = 0; i < 9; i++) {
			face.pecasFaces[i] = this.buildPecaFace(cor);
		}
		
		return face;
	}

	public Face[] build6faces() {
		Face[] faces= new Face[6];
		
		
		faces[Cor.branco.getCor()]= buildFace(Cor.branco);
		faces[Cor.verde.getCor()]= buildFace(Cor.verde);
		faces[Cor.vermelho.getCor()]= buildFace(Cor.vermelho);
		faces[Cor.azul.getCor()]= buildFace(Cor.azul);
		faces[Cor.laranja.getCor()]= buildFace(Cor.laranja);
		faces[Cor.amarelo.getCor()]= buildFace(Cor.amarelo);
		
		return faces;
	}

	public CuboMagico buildCubo() {
		CuboMagico cubo = new CuboMagico();
		cubo.faces = this.build6faces();
		Face faceBranca = cubo.faces[Cor.branco.getCor()];
		Face faceVermelha = cubo.faces[Cor.vermelho.getCor()];
		Face faceLaranja = cubo.faces[Cor.laranja.getCor()];
		Face faceVerde = cubo.faces[Cor.verde.getCor()];
		Face faceAzul = cubo.faces[Cor.azul.getCor()];
		Face faceAmarela = cubo.faces[Cor.amarelo.getCor()];
		
		cubo.facePrincipal=faceBranca;
		faceBranca.setFacesVizinhas(
				faceVermelha, 
				faceLaranja,
				faceAzul,
				faceVerde);
		
		faceVermelha.setFacesVizinhas(
				faceAmarela,
				faceBranca,
				faceAzul,
				faceVerde);

        
		faceAmarela.setFacesVizinhas(
				faceLaranja,
				faceVermelha,
				faceVerde,
				faceAzul);
		
		faceLaranja.setFacesVizinhas(
                faceBranca,
                faceAmarela,
                faceAzul,
                faceVerde);
		
		faceAzul.setFacesVizinhas(
			faceVermelha,
			faceLaranja, 
			faceAmarela, 
			faceBranca);
		
		faceVerde.setFacesVizinhas(
			faceVermelha,
			faceLaranja,
			faceBranca,
			faceAmarela);
		
  
        
        
		return cubo;
	}
	
}
