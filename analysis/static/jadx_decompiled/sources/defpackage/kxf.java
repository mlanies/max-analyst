package defpackage;

import android.net.Uri;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Pair;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import one.me.sdk.media.transformer.impl.MediaInfoRetriever$InvalidMediaException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class kxf implements pa5 {
    public Object X;
    public final Object a;
    public boolean b;
    public final Object c;
    public final Object o;

    public kxf(bwf bwfVar, c8d c8dVar, pl8 pl8Var, sl1 sl1Var, boolean z) {
        this.a = bwfVar;
        this.c = c8dVar;
        this.o = pl8Var;
        this.X = sl1Var;
        this.b = z;
    }

    public static String a(kxf kxfVar, String str) throws InvalidKeyException, InvalidAlgorithmParameterException {
        kxfVar.getClass();
        byte[] bArrDecode = Base64.decode(str, 0);
        kxfVar.d().init(2, kxfVar.e(), new IvParameterSpec(ys.Z(0, bArrDecode, kxfVar.d().getBlockSize())));
        return new String(kxfVar.d().doFinal(ys.Z(kxfVar.d().getBlockSize(), bArrDecode, bArrDecode.length)), a52.a);
    }

    @Override // defpackage.pa5
    /* renamed from: B */
    public yze mo6B(int i, int i2) {
        ua8 ua8Var = new ua8();
        if (i2 == 1) {
            ((ArrayList) this.c).add(ua8Var);
        } else if (i2 != 2) {
            ((ArrayList) this.o).add(ua8Var);
        } else {
            ((ArrayList) this.a).add(ua8Var);
        }
        return ua8Var;
    }

    @Override // defpackage.pa5
    public void J(v1d v1dVar) {
        this.X = v1dVar;
    }

    public String b(String str) {
        d().init(1, e());
        byte[] bArrDoFinal = d().doFinal(str.getBytes(a52.a));
        byte[] iv = d().getIV();
        byte[] bArr = new byte[iv.length + bArrDoFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
        return Base64.encodeToString(bArr, 0);
    }

    public void c() {
        ((a4c) this.o).log("Condition", "Condition # " + ((String) this.a) + " - 🔥 " + ((AtomicLong) this.X).incrementAndGet());
        synchronized (this) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Is already fired");
                }
                this.b = true;
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ((a4c) this.o).log("Condition", "Condition # " + ((String) this.a) + " - executing from queue " + ((String) pair.first) + " " + ((AtomicLong) this.X).incrementAndGet());
                    ((Runnable) pair.second).run();
                }
                ((ArrayList) this.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Cipher d() {
        return (Cipher) ((khe) this.X).getValue();
    }

    public SecretKey e() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        KeyStore keyStore = (KeyStore) ((khe) this.o).getValue();
        String str = (String) this.a;
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null && (secretKey = secretKeyEntry.getSecretKey()) != null) {
            return secretKey;
        }
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding");
        if (this.b) {
            encryptionPaddings.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                encryptionPaddings.setUserAuthenticationParameters(120, 2);
            }
        } else {
            encryptionPaddings.setUserAuthenticationRequired(false);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = encryptionPaddings.setRandomizedEncryptionRequired(true).build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        return keyGenerator.generateKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(org.json.JSONObject r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxf.f(org.json.JSONObject):void");
    }

    public void g(JSONObject jSONObject) {
        cbd cbdVarA;
        if (this.b) {
            bwf bwfVar = (bwf) this.a;
            bwfVar.getClass();
            try {
                cbdVarA = bwfVar.a(jSONObject);
            } catch (JSONException e) {
                ((a4c) bwfVar.a).logException("SessionRoomParser", "Can't parse room update notification", e);
                cbdVarA = null;
            }
            if (cbdVarA == null) {
                return;
            }
            ((sl1) this.X).d(cbdVarA);
        }
    }

    public void h(JSONObject jSONObject) {
        hh2 hh2VarF;
        if (this.b) {
            bwf bwfVar = (bwf) this.a;
            bwfVar.getClass();
            try {
                hh2VarF = bwfVar.f(jSONObject);
            } catch (JSONException e) {
                ((a4c) bwfVar.a).logException("SessionRoomParser", "Can't parse rooms update notification", e);
                hh2VarF = null;
            }
            if (hh2VarF == null) {
                return;
            }
            sl1 sl1Var = (sl1) this.X;
            sl1Var.getClass();
            Iterator it = hh2VarF.a.iterator();
            while (it.hasNext()) {
                sl1Var.d((cbd) it.next());
            }
        }
    }

    public a8g i(String str) {
        d().init(1, e());
        return new a8g(d());
    }

    @Override // defpackage.pa5
    public void w() {
        this.b = true;
    }

    public kxf(String str, a4c a4cVar) {
        this.b = false;
        this.c = new ArrayList();
        this.X = new AtomicLong();
        this.a = str;
        this.o = a4cVar;
    }

    public kxf(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = kxf.class.getName();
        this.o = new khe(new bse(19));
        this.X = new khe(new bse(20));
    }

    public kxf(ta8 ta8Var) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.o = new ArrayList();
        ta8Var.S(this);
        lh4 lh4Var = new lh4();
        while (true) {
            sa8 sa8Var = ta8Var.b;
            sa4 sa4Var = sa8Var.b;
            if (sa4Var != null) {
                int iG = ta8Var.a.g(sa4Var, lh4Var);
                boolean z = this.b;
                if (z && ((v1d) this.X) != null) {
                    return;
                }
                if (iG == 1) {
                    long j = lh4Var.a;
                    Uri uri = sa8Var.a.getUri();
                    if (uri != null) {
                        sa8Var.close();
                        sa8Var.G(new a34(uri, 0L, 1, null, Collections.emptyMap(), j, -1L, null, 0, null));
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    if (iG == -1 && z) {
                        return;
                    }
                    if (iG == -1) {
                        throw new MediaInfoRetriever$InvalidMediaException("Invalid media specified=" + ta8Var.c);
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }
}
