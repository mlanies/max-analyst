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
public final class ic implements r24 {
    public final r24 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream o;

    public ic(r24 r24Var, byte[] bArr, byte[] bArr2) {
        this.a = r24Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                w24 w24Var = new w24(this.a, z24Var);
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

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        this.a.N(y0fVar);
    }

    @Override // defpackage.r24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.r24
    public final void close() {
        if (this.o != null) {
            this.o = null;
            this.a.close();
        }
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.o.getClass();
        int i3 = this.o.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
