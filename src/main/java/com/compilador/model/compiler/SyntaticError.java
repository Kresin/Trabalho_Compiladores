package com.compilador.model.compiler;

public class SyntaticError extends AnalysisError {

    private String token;
    
    public SyntaticError(String msg, int position, String token) {
        super(msg, position);
        this.token = token;
    }

    public SyntaticError(String msg) {
        super(msg);
    }

    public String getToken() {
        return token;
    }
}
