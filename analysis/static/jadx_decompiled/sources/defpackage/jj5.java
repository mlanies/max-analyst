package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class jj5 extends q1 {
    public final /* synthetic */ c6d X;
    public final /* synthetic */ int c = 0;
    public final ArrayDeque o;

    public jj5(lj5 lj5Var) {
        this.X = lj5Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.o = arrayDeque;
        if (lj5Var.a.isDirectory()) {
            arrayDeque.push(b(lj5Var.a));
        } else if (lj5Var.a.isFile()) {
            arrayDeque.push(new hj5(lj5Var.a));
        } else {
            this.a = 2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        r0 = r2;
     */
    @Override // defpackage.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            switch(r0) {
                case 0: goto L5f;
                default: goto L5;
            }
        L5:
            java.util.ArrayDeque r0 = r7.o
            java.lang.Object r1 = r0.peek()
            u2f r1 = (defpackage.u2f) r1
            if (r1 != 0) goto L11
            r0 = 0
            goto L53
        L11:
            java.lang.Object r2 = r1.a()
            if (r2 != 0) goto L1b
            r0.pop()
            goto L5
        L1b:
            c6d r3 = r7.X
            v2f r3 = (defpackage.v2f) r3
            int r4 = r3.c
            r5 = 3
            int r6 = r3.g
            java.lang.Object r1 = r1.a
            if (r4 != r5) goto L3a
            if (r2 == r1) goto L38
            int r1 = r0.size()
            if (r1 < r6) goto L31
            goto L38
        L31:
            p2f r1 = r7.c(r2)
            r0.add(r1)
        L38:
            r0 = r2
            goto L53
        L3a:
            if (r2 == r1) goto L38
            m56 r1 = r3.b
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 == 0) goto L38
            int r1 = r0.size()
            if (r1 < r6) goto L4b
            goto L38
        L4b:
            p2f r1 = r7.c(r2)
            r0.push(r1)
            goto L5
        L53:
            if (r0 == 0) goto L5b
            r7.b = r0
            r0 = 1
            r7.a = r0
            goto L5e
        L5b:
            r0 = 2
            r7.a = r0
        L5e:
            return
        L5f:
            java.util.ArrayDeque r0 = r7.o
            java.lang.Object r1 = r0.peek()
            kj5 r1 = (defpackage.kj5) r1
            if (r1 != 0) goto L6b
            r0 = 0
            goto L9d
        L6b:
            java.io.File r2 = r1.a()
            if (r2 != 0) goto L75
            r0.pop()
            goto L5f
        L75:
            java.io.File r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L9c
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L9c
            int r1 = r0.size()
            c6d r3 = r7.X
            lj5 r3 = (defpackage.lj5) r3
            r3.getClass()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r3) goto L94
            goto L9c
        L94:
            fj5 r1 = r7.b(r2)
            r0.push(r1)
            goto L5f
        L9c:
            r0 = r2
        L9d:
            if (r0 == 0) goto La5
            r7.b = r0
            r0 = 1
            r7.a = r0
            goto La8
        La5:
            r0 = 2
            r7.a = r0
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.a():void");
    }

    public fj5 b(File file) {
        int iS = au1.s(((lj5) this.X).b);
        if (iS == 0) {
            return new ij5(this, file);
        }
        if (iS == 1) {
            return new gj5(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }

    public p2f c(Object obj) {
        int iS = au1.s(((v2f) this.X).c);
        if (iS == 0) {
            return new t2f(this, obj);
        }
        if (iS == 1) {
            return new q2f(this, obj);
        }
        if (iS == 2) {
            return new r2f(this, obj);
        }
        throw new NoWhenBranchMatchedException();
    }

    public jj5(v2f v2fVar) {
        this.X = v2fVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.o = arrayDeque;
        m56 m56Var = v2fVar.b;
        Object obj = v2fVar.a;
        if (m56Var.invoke(obj) != null) {
            arrayDeque.push(c(obj));
            if (v2fVar.c == 3) {
                arrayDeque.push(new s2f(this, obj));
                return;
            }
            return;
        }
        arrayDeque.push(new s2f(this, obj));
    }
}
