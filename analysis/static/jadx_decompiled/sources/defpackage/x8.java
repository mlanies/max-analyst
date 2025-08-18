package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Range;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import kotlinx.serialization.MissingFieldException;
import org.json.HTTP;

/* loaded from: classes.dex */
public final class x8 implements mde, u45 {
    public Object X;
    public Object Y;
    public int a;
    public final Object b;
    public final Object c;
    public Object o;

    public x8(ja7 ja7Var, g9g g9gVar, l0f l0fVar, r6d r6dVar, sw0 sw0Var) {
        this.b = ja7Var;
        this.c = g9gVar;
        this.o = l0fVar;
        this.a = -1;
        la7 la7Var = ja7Var.a;
        this.X = la7Var;
        this.Y = la7Var.f ? null : new qa7(r6dVar);
    }

    public int A(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        while (i2 < size) {
            w8 w8Var = (w8) arrayList.get(i2);
            int i3 = w8Var.a;
            if (i3 == 8) {
                int i4 = w8Var.b;
                if (i4 == i) {
                    i = w8Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (w8Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = w8Var.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = w8Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += w8Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList B() {
        qh3 qh3Var = (qh3) this.X;
        if (qh3Var != null) {
            return (ColorStateList) qh3Var.d;
        }
        return null;
    }

    public PorterDuff.Mode C() {
        qh3 qh3Var = (qh3) this.X;
        if (qh3Var != null) {
            return (PorterDuff.Mode) qh3Var.e;
        }
        return null;
    }

    public boolean D() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void E(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListH;
        View view = (View) this.b;
        k8g k8gVarX = k8g.x(view.getContext(), attributeSet, p3c.ViewBackgroundHelper, i, 0);
        TypedArray typedArray = (TypedArray) k8gVarX.b;
        View view2 = (View) this.b;
        Context context = view2.getContext();
        int[] iArr = p3c.ViewBackgroundHelper;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(view2, context, iArr, attributeSet, (TypedArray) k8gVarX.b, i, 0);
        try {
            if (typedArray.hasValue(p3c.ViewBackgroundHelper_android_background)) {
                this.a = typedArray.getResourceId(p3c.ViewBackgroundHelper_android_background, -1);
                gn gnVar = (gn) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (gnVar) {
                    colorStateListH = gnVar.a.h(context2, i2);
                }
                if (colorStateListH != null) {
                    N(colorStateListH);
                }
            }
            if (typedArray.hasValue(p3c.ViewBackgroundHelper_backgroundTint)) {
                omf.q(view, k8gVarX.l(p3c.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(p3c.ViewBackgroundHelper_backgroundTintMode)) {
                omf.r(view, hq4.c(typedArray.getInt(p3c.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            k8gVarX.z();
        }
    }

    public xo6 F(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new xo6(this, j);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    public w8 G(Object obj, int i, int i2, int i3) {
        w8 w8Var = (w8) ((u5b) this.b).f();
        if (w8Var != null) {
            w8Var.a = i;
            w8Var.b = i2;
            w8Var.d = i3;
            w8Var.c = obj;
            return w8Var;
        }
        w8 w8Var2 = new w8();
        w8Var2.a = i;
        w8Var2.b = i2;
        w8Var2.d = i3;
        w8Var2.c = obj;
        return w8Var2;
    }

    public void H() {
        this.a = -1;
        N(null);
        i();
    }

    public void I(int i) {
        ColorStateList colorStateListH;
        this.a = i;
        gn gnVar = (gn) this.c;
        if (gnVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (gnVar) {
                colorStateListH = gnVar.a.h(context, i);
            }
        } else {
            colorStateListH = null;
        }
        N(colorStateListH);
        i();
    }

    public void J(w8 w8Var) {
        ((ArrayList) this.o).add(w8Var);
        int i = w8Var.a;
        k61 k61Var = (k61) this.X;
        if (i == 1) {
            k61Var.d(w8Var.b, w8Var.d);
            return;
        }
        if (i == 2) {
            int i2 = w8Var.b;
            int i3 = w8Var.d;
            RecyclerView recyclerView = k61Var.a;
            recyclerView.d0(i2, i3, false);
            recyclerView.v1 = true;
            return;
        }
        if (i == 4) {
            k61Var.c(w8Var.b, w8Var.d, w8Var.c);
        } else if (i == 8) {
            k61Var.e(w8Var.b, w8Var.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + w8Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K() {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8.K():void");
    }

    public void L(w8 w8Var) {
        w8Var.c = null;
        ((u5b) this.b).e(w8Var);
    }

    public void M(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            L((w8) list.get(i));
        }
        list.clear();
    }

    public void N(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((qh3) this.o) == null) {
                this.o = new qh3(2);
            }
            qh3 qh3Var = (qh3) this.o;
            qh3Var.d = colorStateList;
            qh3Var.c = true;
        } else {
            this.o = null;
        }
        i();
    }

    public void O(ColorStateList colorStateList) {
        if (((qh3) this.X) == null) {
            this.X = new qh3(2);
        }
        qh3 qh3Var = (qh3) this.X;
        qh3Var.d = colorStateList;
        qh3Var.c = true;
        i();
    }

    public void P(PorterDuff.Mode mode) {
        if (((qh3) this.X) == null) {
            this.X = new qh3(2);
        }
        qh3 qh3Var = (qh3) this.X;
        qh3Var.e = mode;
        qh3Var.b = true;
        i();
    }

    public int Q(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.o;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w8 w8Var = (w8) arrayList.get(size);
            int i5 = w8Var.a;
            if (i5 == 8) {
                int i6 = w8Var.b;
                int i7 = w8Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            w8Var.b = i6 + 1;
                            w8Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            w8Var.b = i6 - 1;
                            w8Var.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        w8Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        w8Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        w8Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        w8Var.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = w8Var.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= w8Var.d;
                    } else if (i5 == 2) {
                        i += w8Var.d;
                    }
                } else if (i2 == 1) {
                    w8Var.b = i8 + 1;
                } else if (i2 == 2) {
                    w8Var.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            w8 w8Var2 = (w8) arrayList.get(size2);
            if (w8Var2.a == 8) {
                int i9 = w8Var2.d;
                if (i9 == w8Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    w8Var2.c = null;
                    ((u5b) this.b).e(w8Var2);
                }
            } else if (w8Var2.d <= 0) {
                arrayList.remove(size2);
                w8Var2.c = null;
                ((u5b) this.b).e(w8Var2);
            }
        }
        return i;
    }

    public void R(cj6 cj6Var, String str) {
        if (this.a != 0) {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        eu0 eu0Var = (eu0) this.Y;
        eu0Var.L(str).L(HTTP.CRLF);
        int size = cj6Var.size();
        for (int i = 0; i < size; i++) {
            eu0Var.L(cj6Var.b(i)).L(": ").L(cj6Var.d(i)).L(HTTP.CRLF);
        }
        eu0Var.L(HTTP.CRLF);
        this.a = 1;
    }

    @Override // defpackage.u45
    public yud a(yic yicVar) {
        if (!mq6.a(yicVar)) {
            return F(0L);
        }
        String strA = yicVar.Y.a(org.apache.http.protocol.HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        if (org.apache.http.protocol.HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
            vq6 vq6Var = yicVar.a.b;
            if (this.a == 4) {
                this.a = 5;
                return new wo6(this, vq6Var);
            }
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        long j = naf.j(yicVar);
        if (j != -1) {
            return F(j);
        }
        if (this.a == 4) {
            this.a = 5;
            ((f8c) this.o).k();
            return new yo6(this);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    @Override // defpackage.u45
    public void b() {
        ((eu0) this.Y).flush();
    }

    @Override // defpackage.u45
    public ksd c(mhc mhcVar, long j) {
        tfg tfgVar = mhcVar.e;
        if (org.apache.http.protocol.HTTP.CHUNK_CODING.equalsIgnoreCase(mhcVar.d.a(org.apache.http.protocol.HTTP.TRANSFER_ENCODING))) {
            if (this.a == 1) {
                this.a = 2;
                return new vo6(this);
            }
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.a == 1) {
            this.a = 2;
            return new gg4(this);
        }
        throw new IllegalStateException(("state: " + this.a).toString());
    }

    @Override // defpackage.u45
    public void cancel() throws IOException {
        Socket socket = ((f8c) this.o).b;
        if (socket != null) {
            naf.d(socket);
        }
    }

    @Override // defpackage.u45
    public long d(yic yicVar) {
        if (!mq6.a(yicVar)) {
            return 0L;
        }
        String strA = yicVar.Y.a(org.apache.http.protocol.HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        if (org.apache.http.protocol.HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
            return -1L;
        }
        return naf.j(yicVar);
    }

    @Override // defpackage.u45
    public xic e(boolean z) throws NumberFormatException, IOException {
        g03 g03Var = (g03) this.b;
        int i = this.a;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(("state: " + this.a).toString());
        }
        try {
            String strG = ((fu0) g03Var.c).G(g03Var.b);
            g03Var.b -= strG.length();
            jn jnVarV = xfg.v(strG);
            int i2 = jnVarV.b;
            xic xicVar = new xic();
            xicVar.b = (sob) jnVarV.c;
            xicVar.c = i2;
            xicVar.d = (String) jnVarV.o;
            xicVar.f = g03Var.Y().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.a = 3;
                return xicVar;
            }
            this.a = 4;
            return xicVar;
        } catch (EOFException e) {
            throw new IOException(wg0.i("unexpected end of stream on ", ((f8c) this.o).q.a.a.g()), e);
        }
    }

    @Override // defpackage.u45
    public f8c f() {
        return (f8c) this.o;
    }

    @Override // defpackage.u45
    public void g(mhc mhcVar) {
        Proxy.Type type = ((f8c) this.o).q.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(mhcVar.c);
        sb.append(' ');
        vq6 vq6Var = mhcVar.b;
        if (vq6Var.a || type != Proxy.Type.HTTP) {
            String strB = vq6Var.b();
            String strD = vq6Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(vq6Var);
        }
        sb.append(" HTTP/1.1");
        R(mhcVar.d, sb.toString());
    }

    @Override // defpackage.mde
    public Object get() {
        Range range = ((o90) this.o).a;
        fa0 fa0Var = (fa0) this.Y;
        int i = fa0Var.c;
        n90 n90Var = (n90) this.X;
        int iE = wmd.E(i, n90Var.c, fa0Var.e, n90Var.b, fa0Var.d, range);
        z23 z23Var = new z23();
        z23Var.b = -1;
        String str = (String) this.b;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        z23Var.a = str;
        z23Var.b = Integer.valueOf(this.a);
        bue bueVar = (bue) this.c;
        if (bueVar == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        z23Var.c = bueVar;
        z23Var.f = Integer.valueOf(n90Var.c);
        z23Var.e = Integer.valueOf(n90Var.b);
        z23Var.d = Integer.valueOf(iE);
        return z23Var.b();
    }

    @Override // defpackage.u45
    public void h() {
        ((eu0) this.Y).flush();
    }

    public void i() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((qh3) this.o) != null) {
                if (((qh3) this.Y) == null) {
                    this.Y = new qh3(2);
                }
                qh3 qh3Var = (qh3) this.Y;
                qh3Var.d = null;
                qh3Var.c = false;
                qh3Var.e = null;
                qh3Var.b = false;
                WeakHashMap weakHashMap = zmf.a;
                ColorStateList colorStateListG = omf.g(view);
                if (colorStateListG != null) {
                    qh3Var.c = true;
                    qh3Var.d = colorStateListG;
                }
                PorterDuff.Mode modeH = omf.h(view);
                if (modeH != null) {
                    qh3Var.b = true;
                    qh3Var.e = modeH;
                }
                if (qh3Var.c || qh3Var.b) {
                    gn.e(background, qh3Var, view.getDrawableState());
                    return;
                }
            }
            qh3 qh3Var2 = (qh3) this.X;
            if (qh3Var2 != null) {
                gn.e(background, qh3Var2, view.getDrawableState());
                return;
            }
            qh3 qh3Var3 = (qh3) this.o;
            if (qh3Var3 != null) {
                gn.e(background, qh3Var3, view.getDrawableState());
            }
        }
    }

    public x8 j(r6d r6dVar) {
        ja7 ja7Var = (ja7) this.b;
        g9g g9gVarG = fp3.G(ja7Var, r6dVar);
        l0f l0fVar = (l0f) this.o;
        jn jnVar = (jn) l0fVar.o;
        int i = jnVar.b + 1;
        jnVar.b = i;
        Object[] objArr = (Object[]) jnVar.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            jnVar.c = Arrays.copyOf(objArr, i2);
            jnVar.o = Arrays.copyOf((int[]) jnVar.o, i2);
        }
        ((Object[]) jnVar.c)[i] = r6dVar;
        l0fVar.m(g9gVarG.a);
        if (l0fVar.N() == 4) {
            l0f.u(l0fVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = g9gVarG.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && ((g9g) this.c) == g9gVarG && ja7Var.a.f) {
            return this;
        }
        x8 x8Var = new x8((ja7) this.b, g9gVarG, (l0f) this.o, r6dVar, (sw0) null);
        return x8Var;
    }

    public boolean k(int i) {
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w8 w8Var = (w8) arrayList.get(i2);
            int i3 = w8Var.a;
            if (i3 == 8) {
                if (A(w8Var.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = w8Var.b;
                int i5 = w8Var.d + i4;
                while (i4 < i5) {
                    if (A(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((k61) this.X).a((w8) arrayList.get(i));
        }
        M(arrayList);
        this.a = 0;
    }

    public void m() {
        l();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w8 w8Var = (w8) arrayList.get(i);
            int i2 = w8Var.a;
            k61 k61Var = (k61) this.X;
            if (i2 == 1) {
                k61Var.a(w8Var);
                k61Var.d(w8Var.b, w8Var.d);
            } else if (i2 == 2) {
                k61Var.a(w8Var);
                int i3 = w8Var.b;
                int i4 = w8Var.d;
                RecyclerView recyclerView = k61Var.a;
                recyclerView.d0(i3, i4, true);
                recyclerView.v1 = true;
                recyclerView.s1.d += i4;
            } else if (i2 == 4) {
                k61Var.a(w8Var);
                k61Var.c(w8Var.b, w8Var.d, w8Var.c);
            } else if (i2 == 8) {
                k61Var.a(w8Var);
                k61Var.e(w8Var.b, w8Var.d);
            }
        }
        M(arrayList);
        this.a = 0;
    }

    public boolean n() {
        boolean z;
        boolean z2;
        l0f l0fVar = (l0f) this.o;
        int iT = l0fVar.T();
        String str = (String) l0fVar.c;
        if (iT == str.length()) {
            l0f.u(l0fVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            z = true;
        } else {
            z = false;
        }
        int iP = l0fVar.P(iT);
        if (iP >= str.length() || iP == -1) {
            l0f.u(l0fVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iP + 1;
        int iCharAt = str.charAt(iP) | ' ';
        if (iCharAt == 102) {
            l0fVar.j(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                l0f.u(l0fVar, "Expected valid boolean literal prefix, but had '" + l0fVar.o() + '\'', 0, null, 6);
                throw null;
            }
            l0fVar.j(i, "rue");
            z2 = true;
        }
        if (z) {
            if (l0fVar.b == str.length()) {
                l0f.u(l0fVar, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(l0fVar.b) != '\"') {
                l0f.u(l0fVar, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            l0fVar.b++;
        }
        return z2;
    }

    public boolean o(r6d r6dVar, int i) {
        return n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0126, code lost:
    
        if (r11 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0128, code lost:
    
        r0 = r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012c, code lost:
    
        if (r9 >= 64) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012e, code lost:
    
        r0.a |= 1 << r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0137, code lost:
    
        r1 = (r9 >>> 6) - 1;
        r0 = (long[]) r0.o;
        r0[r1] = r0[r1] | (1 << (r9 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0149, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int p(defpackage.r6d r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x8.p(r6d):int");
    }

    public int q(r6d r6dVar) {
        return tu0.k(r6dVar, (ja7) this.b, v(), " at path ".concat(((jn) ((l0f) this.o).o).u()));
    }

    public boolean r() {
        qa7 qa7Var = (qa7) this.Y;
        return ((qa7Var != null ? qa7Var.b : false) || ((l0f) this.o).V(true)) ? false : true;
    }

    public Object s(r6d r6dVar, int i, String str) {
        s9e s9eVar = s9e.a;
        s9e s9eVar2 = s9e.a;
        if (r()) {
            return u(s9eVar);
        }
        return null;
    }

    public Object t(r6d r6dVar, int i, cc7 cc7Var, Object obj) {
        boolean z = ((g9g) this.c) == g9g.X && (i & 1) == 0;
        l0f l0fVar = (l0f) this.o;
        if (z) {
            jn jnVar = (jn) l0fVar.o;
            int[] iArr = (int[]) jnVar.o;
            int i2 = jnVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) jnVar.c)[i2] = nd2.X;
            }
        }
        Object objU = u(cc7Var);
        if (z) {
            jn jnVar2 = (jn) l0fVar.o;
            int[] iArr2 = (int[]) jnVar2.o;
            int i3 = jnVar2.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                jnVar2.b = i4;
                Object[] objArr = (Object[]) jnVar2.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    jnVar2.c = Arrays.copyOf(objArr, i5);
                    jnVar2.o = Arrays.copyOf((int[]) jnVar2.o, i5);
                }
            }
            Object[] objArr2 = (Object[]) jnVar2.c;
            int i6 = jnVar2.b;
            objArr2[i6] = objU;
            ((int[]) jnVar2.o)[i6] = -2;
        }
        return objU;
    }

    public Object u(cc7 cc7Var) {
        try {
            return cc7Var.a(this);
        } catch (MissingFieldException e) {
            if (w9e.p0(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new MissingFieldException((ArrayList) e.a, e.getMessage() + " at path: " + ((jn) ((l0f) this.o).o).u(), e);
        }
    }

    public String v() {
        boolean z = ((la7) this.X).c;
        l0f l0fVar = (l0f) this.o;
        return z ? l0fVar.p() : l0fVar.n();
    }

    public String w(r6d r6dVar, int i) {
        return v();
    }

    public void x(w8 w8Var) {
        int i;
        int i2 = w8Var.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iQ = Q(w8Var.b, i2);
        int i3 = w8Var.b;
        int i4 = w8Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + w8Var);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < w8Var.d; i6++) {
            int iQ2 = Q((i * i6) + w8Var.b, w8Var.a);
            int i7 = w8Var.a;
            if (i7 == 2 ? iQ2 != iQ : !(i7 == 4 && iQ2 == iQ + 1)) {
                w8 w8VarG = G(w8Var.c, i7, iQ, i5);
                y(w8VarG, i3);
                w8VarG.c = null;
                ((u5b) this.b).e(w8VarG);
                if (w8Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iQ = iQ2;
            } else {
                i5++;
            }
        }
        Object obj = w8Var.c;
        w8Var.c = null;
        ((u5b) this.b).e(w8Var);
        if (i5 > 0) {
            w8 w8VarG2 = G(obj, w8Var.a, iQ, i5);
            y(w8VarG2, i3);
            w8VarG2.c = null;
            ((u5b) this.b).e(w8VarG2);
        }
    }

    public void y(w8 w8Var, int i) {
        k61 k61Var = (k61) this.X;
        k61Var.a(w8Var);
        int i2 = w8Var.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            k61Var.c(i, w8Var.d, w8Var.c);
        } else {
            int i3 = w8Var.d;
            RecyclerView recyclerView = k61Var.a;
            recyclerView.d0(i, i3, true);
            recyclerView.v1 = true;
            recyclerView.s1.d += i3;
        }
    }

    public void z(r6d r6dVar) {
        ja7 ja7Var = (ja7) this.b;
        if (ja7Var.a.b && r6dVar.f() == 0) {
            while (p(r6dVar) != -1) {
            }
        }
        l0f l0fVar = (l0f) this.o;
        if (l0fVar.U() && !ja7Var.a.n) {
            xfg.q(l0fVar, "");
            throw null;
        }
        l0fVar.m(((g9g) this.c).b);
        jn jnVar = (jn) l0fVar.o;
        int i = jnVar.b;
        int[] iArr = (int[]) jnVar.o;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            jnVar.b = i - 1;
        }
        int i2 = jnVar.b;
        if (i2 != -1) {
            jnVar.b = i2 - 1;
        }
    }

    public x8(View view) {
        this.a = -1;
        this.b = view;
        this.c = gn.a();
    }

    public x8(String str, int i, o90 o90Var, n90 n90Var, fa0 fa0Var) {
        bue bueVar = bue.a;
        this.b = str;
        this.a = i;
        this.c = bueVar;
        this.o = o90Var;
        this.X = n90Var;
        this.Y = fa0Var;
    }

    public x8(u2a u2aVar, f8c f8cVar, fu0 fu0Var, eu0 eu0Var) {
        this.c = u2aVar;
        this.o = f8cVar;
        this.X = fu0Var;
        this.Y = eu0Var;
        this.b = new g03(fu0Var);
    }

    public x8(k61 k61Var) {
        this.b = new u5b(30);
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.a = 0;
        this.X = k61Var;
        this.Y = new y8(this);
    }
}
