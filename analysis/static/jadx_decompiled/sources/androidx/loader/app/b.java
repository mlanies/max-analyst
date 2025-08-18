package androidx.loader.app;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import defpackage.au1;
import defpackage.eh7;
import defpackage.kvd;
import defpackage.mdg;
import defpackage.mo7;
import defpackage.nec;
import defpackage.no7;
import defpackage.rgg;
import defpackage.wmc;
import defpackage.xje;
import defpackage.xnf;
import defpackage.z04;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {
    public final eh7 a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(eh7 eh7Var, xnf xnfVar) {
        this.a = eh7Var;
        this.b = (LoaderManagerImpl$LoaderViewModel) new xje(xnfVar, LoaderManagerImpl$LoaderViewModel.d).b(nec.a(LoaderManagerImpl$LoaderViewModel.class));
    }

    public final void a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.b.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i = 0;
        while (true) {
            kvd kvdVar = loaderManagerImpl$LoaderViewModel.b;
            if (i >= kvdVar.c) {
                return;
            }
            mo7 mo7Var = (mo7) kvdVar.b[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(loaderManagerImpl$LoaderViewModel.b.a[i]);
            printWriter.print(": ");
            printWriter.println(mo7Var.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(mo7Var.l);
            printWriter.print(" mArgs=");
            printWriter.println(mo7Var.m);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(mo7Var.n);
            rgg rggVar = mo7Var.n;
            String strG = au1.g(str2, "  ");
            rggVar.getClass();
            printWriter.print(strG);
            printWriter.print("mId=");
            printWriter.print(rggVar.a);
            printWriter.print(" mListener=");
            printWriter.println(rggVar.b);
            if (rggVar.c || rggVar.f) {
                printWriter.print(strG);
                printWriter.print("mStarted=");
                printWriter.print(rggVar.c);
                printWriter.print(" mContentChanged=");
                printWriter.print(rggVar.f);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (rggVar.d || rggVar.e) {
                printWriter.print(strG);
                printWriter.print("mAbandoned=");
                printWriter.print(rggVar.d);
                printWriter.print(" mReset=");
                printWriter.println(rggVar.e);
            }
            if (rggVar.h != null) {
                printWriter.print(strG);
                printWriter.print("mTask=");
                printWriter.print(rggVar.h);
                printWriter.print(" waiting=");
                rggVar.h.getClass();
                printWriter.println(false);
            }
            if (rggVar.i != null) {
                printWriter.print(strG);
                printWriter.print("mCancellingTask=");
                printWriter.print(rggVar.i);
                printWriter.print(" waiting=");
                rggVar.i.getClass();
                printWriter.println(false);
            }
            if (mo7Var.p != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(mo7Var.p);
                no7 no7Var = mo7Var.p;
                no7Var.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(no7Var.b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            rgg rggVar2 = mo7Var.n;
            Object objD = mo7Var.d();
            rggVar2.getClass();
            StringBuilder sb = new StringBuilder(64);
            z04.g(sb, objD);
            sb.append("}");
            printWriter.println(sb.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(mo7Var.c > 0);
            i++;
        }
    }

    public final rgg b(wmc wmcVar) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        mo7 mo7Var = (mo7) loaderManagerImpl$LoaderViewModel.b.c(0);
        eh7 eh7Var = this.a;
        if (mo7Var != null) {
            rgg rggVar = mo7Var.n;
            no7 no7Var = new no7(rggVar, wmcVar);
            mo7Var.e(eh7Var, no7Var);
            no7 no7Var2 = mo7Var.p;
            if (no7Var2 != null) {
                mo7Var.j(no7Var2);
            }
            mo7Var.o = eh7Var;
            mo7Var.p = no7Var;
            return rggVar;
        }
        try {
            loaderManagerImpl$LoaderViewModel.c = true;
            SignInHubActivity signInHubActivity = (SignInHubActivity) wmcVar.a;
            Set set = mdg.b;
            synchronized (set) {
            }
            rgg rggVar2 = new rgg(signInHubActivity, set);
            if (rgg.class.isMemberClass() && !Modifier.isStatic(rgg.class.getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + rggVar2);
            }
            mo7 mo7Var2 = new mo7(rggVar2);
            loaderManagerImpl$LoaderViewModel.b.d(0, mo7Var2);
            loaderManagerImpl$LoaderViewModel.c = false;
            rgg rggVar3 = mo7Var2.n;
            no7 no7Var3 = new no7(rggVar3, wmcVar);
            mo7Var2.e(eh7Var, no7Var3);
            no7 no7Var4 = mo7Var2.p;
            if (no7Var4 != null) {
                mo7Var2.j(no7Var4);
            }
            mo7Var2.o = eh7Var;
            mo7Var2.p = no7Var3;
            return rggVar3;
        } catch (Throwable th) {
            loaderManagerImpl$LoaderViewModel.c = false;
            throw th;
        }
    }

    public final void c() {
        kvd kvdVar = this.b.b;
        int i = kvdVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mo7) kvdVar.b[i2]).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        z04.g(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
