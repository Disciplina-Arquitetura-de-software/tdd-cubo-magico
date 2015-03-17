package br.edu.ifrn.diatinf.cubo.entities;

class StateContext {
    private Statelike myState;
    StateContext() {
        setState(new StateLowerCase());
    }
 
    /**
     * Setter method for the state.
     * Normally only called by classes implementing the State interface.
     * @param newState the new state of this context
     */
    void setState(final Statelike newState) {
        myState = newState;
    }
 
    public void writeName(final String name) {
        myState.writeName(this, name);
    }
}