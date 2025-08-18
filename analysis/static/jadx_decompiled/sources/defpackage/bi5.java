package defpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class bi5 {
    public final int a;
    public final sx3 b;
    public final int c;
    public final qec d;
    public final qec e;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public vxd j;
    public final String f = bi5.class.getName();
    public final y77 k = pag.a();
    public final aj9 l = bj9.a();
    public final kld m = lld.b(0, 0, 0, 7);

    public bi5(yf3 yf3Var, int i, sx3 sx3Var, int i2, qec qecVar, qec qecVar2) {
        this.a = i;
        this.b = sx3Var;
        this.c = i2;
        this.d = qecVar;
        this.e = qecVar2;
        final int i3 = 0;
        this.g = tu0.r(2, new sh5(0, yf3Var));
        this.h = tu0.r(2, new k56(this) { // from class: th5
            public final /* synthetic */ bi5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() throws IOException {
                switch (i3) {
                    case 0:
                        File file = new File(bi5.d((String) this.b.g.getValue(), false));
                        v3c.g(file);
                        return file;
                    default:
                        return new File(bi5.d((String) this.b.g.getValue(), true));
                }
            }
        });
        final int i4 = 1;
        this.i = tu0.r(2, new k56(this) { // from class: th5
            public final /* synthetic */ bi5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() throws IOException {
                switch (i4) {
                    case 0:
                        File file = new File(bi5.d((String) this.b.g.getValue(), false));
                        v3c.g(file);
                        return file;
                    default:
                        return new File(bi5.d((String) this.b.g.getValue(), true));
                }
            }
        });
        this.j = j47.T(sx3Var, null, null, new zh5(this, null, null), 3);
    }

    public static final void a(bi5 bi5Var, Collection collection) throws IOException {
        bi5Var.getClass();
        collection.size();
        if (!(!collection.isEmpty())) {
            return;
        }
        v3c.g(bi5Var.c());
        FileWriter fileWriter = new FileWriter(bi5Var.c(), true);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            try {
                PrintWriter printWriter = new PrintWriter(bufferedWriter);
                try {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        printWriter.println((String) it.next());
                    }
                    if (bi5Var.c().length() / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY > bi5Var.a) {
                        try {
                            if (bi5Var.c().renameTo((File) bi5Var.i.getValue())) {
                                v3c.g(bi5Var.c());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    v3c.i(printWriter, null);
                    v3c.i(bufferedWriter, null);
                    v3c.i(fileWriter, null);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                v3c.i(fileWriter, th);
                throw th2;
            }
        }
    }

    public static String d(String str, boolean z) {
        return au1.g(str, z ? ".1.log" : ".log");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(6:13|53|14|46|47|48)(2:18|19))(7:20|56|21|34|39|(1:42)|(1:44)(4:45|46|47|48)))(1:26))(2:27|(1:29))|51|30|(1:32)(5:33|34|39|(0)|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v13, types: [xi9] */
    /* JADX WARN: Type inference failed for: r8v15, types: [xi9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi5.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final File c() {
        return (File) this.h.getValue();
    }
}
