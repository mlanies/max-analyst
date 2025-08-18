package defpackage;

import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes.dex */
public final class cu4 implements dl4 {
    public final int a;
    public final ide b;
    public final String c;
    public final lq9 d;
    public volatile ph4 e = new ph4((Object) null, (Object) null, false);

    public cu4(int i, ide ideVar, String str, lq9 lq9Var) {
        this.a = i;
        this.d = lq9Var;
        this.b = ideVar;
        this.c = str;
    }

    @Override // defpackage.dl4
    public final kg5 a(Object obj, String str) {
        return h().a(obj, str);
    }

    @Override // defpackage.dl4
    public final void b() {
        try {
            h().b();
        } catch (IOException e) {
            if (ta5.a.i(6)) {
                ta5.a.e(cu4.class.getSimpleName(), "purgeUnexpectedResources", e);
            }
        }
    }

    @Override // defpackage.dl4
    public final long c(l94 l94Var) {
        return h().c(l94Var);
    }

    @Override // defpackage.dl4
    public final Collection d() {
        return h().d();
    }

    @Override // defpackage.dl4
    public final void e() {
        h().e();
    }

    @Override // defpackage.dl4
    public final vq7 f(Object obj, String str) {
        return h().f(obj, str);
    }

    public final void g() throws FileUtils$CreateDirectoryException {
        File file = new File((File) this.b.get(), this.c);
        try {
            oag.y(file);
            String absolutePath = file.getAbsolutePath();
            if (ta5.a.i(3)) {
                ta5.a.d(cu4.class.getSimpleName(), "Created cache directory " + absolutePath);
            }
            this.e = new ph4((Object) file, (Object) new o94(file, this.a, this.d), false);
        } catch (FileUtils$CreateDirectoryException e) {
            this.d.getClass();
            throw e;
        }
    }

    public final synchronized dl4 h() {
        dl4 dl4Var;
        File file;
        try {
            ph4 ph4Var = this.e;
            if (((dl4) ph4Var.a) == null || (file = (File) ph4Var.b) == null || !file.exists()) {
                if (((dl4) this.e.a) != null && ((File) this.e.b) != null) {
                    mqd.f((File) this.e.b);
                }
                g();
            }
            dl4Var = (dl4) this.e.a;
            dl4Var.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return dl4Var;
    }

    @Override // defpackage.dl4
    public final boolean isExternal() {
        try {
            return h().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }
}
