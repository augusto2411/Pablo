package pablo;

public class Projeto {
    private int id;
    private String tituloDoProjeto;
    private String areaDoProjeto;
    private String resumo;
    private String palavraChave1;
    private String palavraChave2;
    private String palavraChave3;
    private String urlDocumento;
    private Professor professorResponsavel;
    private Aluno aluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloDoProjeto() {
        return tituloDoProjeto;
    }

    public void setTituloDoProjeto(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public String getAreaDoProjeto() {
        return areaDoProjeto;
    }

    public void setAreaDoProjeto(String areaDoProjeto) {
        this.areaDoProjeto = areaDoProjeto;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getPalavraChave1() {
        return palavraChave1;
    }

    public void setPalavraChave1(String palavraChave1) {
        this.palavraChave1 = palavraChave1;
    }

    public String getPalavraChave2() {
        return palavraChave2;
    }

    public void setPalavraChave2(String palavraChave2) {
        this.palavraChave2 = palavraChave2;
    }

    public String getPalavraChave3() {
        return palavraChave3;
    }

    public void setPalavraChave3(String palavraChave3) {
        this.palavraChave3 = palavraChave3;
    }

    public String getUrlDocumento() {
        return urlDocumento;
    }

    public void setUrlDocumento(String urlDocumento) {
        this.urlDocumento = urlDocumento;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
