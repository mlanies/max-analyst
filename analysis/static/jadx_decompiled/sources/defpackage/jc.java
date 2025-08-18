package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class jc implements t24 {
    public final t24 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream o;

    public jc(t24 t24Var, byte[] bArr, byte[] bArr2) {
        this.a = t24Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                w24 w24Var = new w24(this.a, a34Var);
                this.o = new CipherInputStream(w24Var, cipher);
                w24Var.m();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        this.a.H(z0fVar);
    }

    @Override // defpackage.t24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.t24
    public final void close() {
        if (this.o != null) {
            this.o = null;
            this.a.close();
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.o.getClass();
        int i3 = this.o.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
