package defpackage;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zk5 {
    public final Signature a;
    public final Cipher b;
    public final Mac c;

    public zk5(Signature signature) {
        this.a = signature;
        this.b = null;
        this.c = null;
    }

    public zk5(Cipher cipher) {
        this.b = cipher;
        this.a = null;
        this.c = null;
    }

    public zk5(Mac mac) {
        this.c = mac;
        this.b = null;
        this.a = null;
    }
}
