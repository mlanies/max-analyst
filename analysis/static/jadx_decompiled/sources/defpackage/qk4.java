package defpackage;

import android.os.StrictMode;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class qk4 extends nud {
    public final File a;
    public final int b;
    public final List c = Arrays.asList(new String[0]);

    public qk4(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // defpackage.nud
    public String b() {
        return "DirectorySoSource";
    }

    @Override // defpackage.nud
    public final int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws NoSuchAlgorithmException, IOException {
        if (SoLoader.b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        boolean zContains = this.c.contains(str);
        File file = this.a;
        if (zContains) {
            file.getCanonicalPath();
            return 0;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2 = null;
        }
        if (file2 == null) {
            file.getCanonicalPath();
            return 0;
        }
        String canonicalPath = file2.getCanonicalPath();
        int i2 = i & 1;
        int i3 = this.b;
        if (i2 != 0 && (i3 & 2) != 0) {
            return 2;
        }
        if ((i3 & 1) != 0) {
            gw4 gw4Var = new gw4();
            gw4Var.a = file2;
            FileInputStream fileInputStream = new FileInputStream(gw4Var.a);
            gw4Var.b = fileInputStream;
            gw4Var.c = fileInputStream.getChannel();
            try {
                String[] strArrA = d.a(str, gw4Var);
                Arrays.toString(strArrA);
                for (String str2 : strArrA) {
                    if (!str2.startsWith("/")) {
                        SoLoader.i(str2, null, i | 1, threadPolicy);
                    }
                }
                gw4Var.close();
            } catch (Throwable th) {
                try {
                    gw4Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        try {
            SoLoader.b.l(i, canonicalPath);
            return 1;
        } catch (UnsatisfiedLinkError e) {
            throw hm9.i(str, e);
        }
    }

    @Override // defpackage.nud
    public final String toString() {
        String name;
        File file = this.a;
        try {
            name = String.valueOf(file.getCanonicalPath());
        } catch (IOException unused) {
            name = file.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return au1.h(sb, this.b, ']');
    }
}
