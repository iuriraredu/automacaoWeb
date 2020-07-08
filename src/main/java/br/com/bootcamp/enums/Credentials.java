package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.CredentialsImp;

public enum  Credentials implements CredentialsImp {
    CADASTRADO {
        @Override
        public String usuario () {
            return "iuriraredu";
        }

        @Override
        public String senha () {
            return "";
        }

    };

}
