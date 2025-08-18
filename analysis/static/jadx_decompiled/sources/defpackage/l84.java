package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.camera.core.ImageCaptureException;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

/* loaded from: classes.dex */
public final class l84 implements lg {
    public static final /* synthetic */ int f = 0;
    public Object a;
    public Object d;
    public Object e = new LinkedHashMap();
    public Object b = HttpGet.METHOD_NAME;
    public Object c = new bj6();

    public int A() {
        int iM;
        kq0.e();
        c54.p("The ImageReader is not initialized.", ((hqc) this.b) != null);
        hqc hqcVar = (hqc) this.b;
        synchronized (hqcVar.a) {
            iM = hqcVar.o.m() - hqcVar.b;
        }
        return iM;
    }

    public int B(int i, ym5 ym5Var, int i2) {
        Object obj = (xm5) this.a;
        a aVar = (a) obj;
        bn5 bn5Var = (bn5) ym5Var;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) obj;
        int iX = a.x(flexboxLayoutManager.f(), flexboxLayoutManager.o, flexboxLayoutManager.m, aVar.I() + aVar.L() + ((ViewGroup.MarginLayoutParams) bn5Var).topMargin + ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) bn5Var).height);
        int size = View.MeasureSpec.getSize(iX);
        int i3 = bn5Var.w0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(iX));
        }
        int i4 = bn5Var.u0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(iX)) : iX;
    }

    public int C(int i, ym5 ym5Var, int i2) {
        Object obj = (xm5) this.a;
        a aVar = (a) obj;
        bn5 bn5Var = (bn5) ym5Var;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) obj;
        int iX = a.x(flexboxLayoutManager.e(), flexboxLayoutManager.n, flexboxLayoutManager.l, aVar.K() + aVar.J() + ((ViewGroup.MarginLayoutParams) bn5Var).leftMargin + ((ViewGroup.MarginLayoutParams) bn5Var).rightMargin + i2, ((ViewGroup.MarginLayoutParams) bn5Var).width);
        int size = View.MeasureSpec.getSize(iX);
        int i3 = bn5Var.v0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(iX));
        }
        int i4 = bn5Var.t0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(iX)) : iX;
    }

    public void D(String str, String str2) {
        ((bj6) this.c).h(str, str2);
    }

    public void E(View view, zm5 zm5Var, int i, int i2, int i3, int i4) {
        ym5 ym5Var = (ym5) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((xm5) this.a);
        int i5 = flexboxLayoutManager.r;
        bn5 bn5Var = (bn5) ym5Var;
        int i6 = bn5Var.Z;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = zm5Var.c;
        if (i5 != 0) {
            if (i5 == 1) {
                if (flexboxLayoutManager.q != 2) {
                    int i8 = i2 + i7;
                    int measuredHeight = i8 - view.getMeasuredHeight();
                    int i9 = ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin;
                    view.layout(i, measuredHeight - i9, i3, i8 - i9);
                    return;
                }
                view.layout(i, view.getMeasuredHeight() + (i2 - i7) + ((ViewGroup.MarginLayoutParams) bn5Var).topMargin, i3, view.getMeasuredHeight() + (i4 - i7) + ((ViewGroup.MarginLayoutParams) bn5Var).topMargin);
                return;
            }
            if (i5 == 2) {
                int measuredHeight2 = (((i7 - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) bn5Var).topMargin) - ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin) / 2;
                if (flexboxLayoutManager.q != 2) {
                    int i10 = i2 + measuredHeight2;
                    view.layout(i, i10, i3, view.getMeasuredHeight() + i10);
                    return;
                } else {
                    int i11 = i2 - measuredHeight2;
                    view.layout(i, i11, i3, view.getMeasuredHeight() + i11);
                    return;
                }
            }
            if (i5 == 3) {
                if (flexboxLayoutManager.q != 2) {
                    int iMax = Math.max(zm5Var.h - view.getBaseline(), ((ViewGroup.MarginLayoutParams) bn5Var).topMargin);
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (zm5Var.h - view.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin);
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (i5 != 4) {
                return;
            }
        }
        if (flexboxLayoutManager.q != 2) {
            int i12 = ((ViewGroup.MarginLayoutParams) bn5Var).topMargin;
            view.layout(i, i2 + i12, i3, i4 + i12);
        } else {
            int i13 = ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin;
            view.layout(i, i2 - i13, i3, i4 - i13);
        }
    }

    public void F(View view, zm5 zm5Var, boolean z, int i, int i2, int i3, int i4) {
        ym5 ym5Var = (ym5) view.getLayoutParams();
        int i5 = ((FlexboxLayoutManager) ((xm5) this.a)).r;
        bn5 bn5Var = (bn5) ym5Var;
        int i6 = bn5Var.Z;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = zm5Var.c;
        if (i5 != 0) {
            if (i5 == 1) {
                if (!z) {
                    view.layout(((i + i7) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) bn5Var).rightMargin, i2, ((i3 + i7) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) bn5Var).rightMargin, i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i7) + ((ViewGroup.MarginLayoutParams) bn5Var).leftMargin, i2, view.getMeasuredWidth() + (i3 - i7) + ((ViewGroup.MarginLayoutParams) bn5Var).leftMargin, i4);
                return;
            }
            if (i5 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i7 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (i5 != 3 && i5 != 4) {
                return;
            }
        }
        if (z) {
            int i8 = ((ViewGroup.MarginLayoutParams) bn5Var).rightMargin;
            view.layout(i - i8, i2, i3 - i8, i4);
        } else {
            int i9 = ((ViewGroup.MarginLayoutParams) bn5Var).leftMargin;
            view.layout(i + i9, i2, i3 + i9, i4);
        }
    }

    public void G(String str, tfg tfgVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (tfgVar == null) {
            if (!(!(str.equals(HttpPost.METHOD_NAME) || str.equals(HttpPut.METHOD_NAME) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")))) {
                throw new IllegalArgumentException(zr6.i("method ", str, " must have a request body.").toString());
            }
        } else if (!tu0.z(str)) {
            throw new IllegalArgumentException(zr6.i("method ", str, " must not have a request body.").toString());
        }
        this.b = str;
        this.d = tfgVar;
    }

    public void H(ov6 ov6Var) throws Exception {
        kq0.e();
        if (((x9b) this.a) == null) {
            Objects.toString(ov6Var);
            ov6Var.close();
            return;
        }
        nje njeVarC = ov6Var.getImageInfo().c();
        if (((Integer) njeVarC.a.get(((x9b) this.a).g)) == null) {
            ov6Var.close();
            return;
        }
        kq0.e();
        ib0 ib0Var = (ib0) this.c;
        Objects.requireNonNull(ib0Var);
        ib0Var.a.accept(new jb0((x9b) this.a, ov6Var));
        x9b x9bVar = (x9b) this.a;
        this.a = null;
        int i = x9bVar.j;
        yhc yhcVar = x9bVar.f;
        if (i != -1 && i != 100) {
            x9bVar.j = 100;
            yhcVar.getClass();
            kq0.e();
            if (!yhcVar.g) {
                fc0 fc0Var = yhcVar.a;
                fc0Var.getClass();
                fc0Var.b.execute(new wje(fc0Var));
            }
        }
        yhcVar.getClass();
        kq0.e();
        if (yhcVar.g) {
            return;
        }
        if (!yhcVar.h) {
            kq0.e();
            if (!yhcVar.g && !yhcVar.h) {
                yhcVar.h = true;
                ey1 ey1Var = yhcVar.a.c;
            }
        }
        yhcVar.e.b(null);
    }

    public void I(x9b x9bVar) {
        kq0.e();
        c54.p("only one capture stage is supported.", x9bVar.h.size() == 1);
        c54.p("Too many acquire images. Close image to be able to process next.", A() > 0);
        this.a = x9bVar;
        kq0.a(x9bVar.i, new ph4((Object) this, (Object) x9bVar, false), ju0.k());
    }

    public void J(String str) {
        ((bj6) this.c).g(str);
    }

    public void K(ia0 ia0Var) {
        av1 av1Var = new av1();
        hc0 hc0Var = (hc0) this.a;
        if (hc0Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = (String) this.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        if (((av1) this.d) == null) {
            throw new NullPointerException("Null transformer");
        }
        i15 i15Var = (i15) this.c;
        if (i15Var == null) {
            throw new NullPointerException("Null encoding");
        }
        o2f o2fVar = (o2f) this.e;
        o2fVar.getClass();
        z8b z8bVar = z8b.a;
        vq7 vq7VarA = hc0.a();
        vq7VarA.t(hc0Var.a);
        vq7VarA.o = z8bVar;
        vq7VarA.c = hc0Var.b;
        hc0 hc0VarJ = vq7VarA.j();
        ai3 ai3Var = new ai3();
        ai3Var.Y = new HashMap();
        ai3Var.o = Long.valueOf(o2fVar.a.a());
        ai3Var.X = Long.valueOf(o2fVar.b.a());
        ai3Var.a = str;
        a99 a99Var = (a99) ia0Var.a;
        a99Var.getClass();
        pl8 pl8Var = kob.a;
        pl8Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            pl8Var.v(a99Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        ai3Var.c = new i05(i15Var, byteArrayOutputStream.toByteArray());
        ai3Var.b = null;
        ja0 ja0VarC = ai3Var.c();
        kd4 kd4Var = (kd4) o2fVar.c;
        kd4Var.getClass();
        kd4Var.b.execute(new yg3(kd4Var, hc0VarJ, av1Var, ja0VarC, 1));
    }

    public void L(ec0 ec0Var) {
        boolean z;
        kq0.e();
        x9b x9bVar = (x9b) this.a;
        if (x9bVar != null) {
            if (x9bVar.a == ec0Var.a) {
                yhc yhcVar = x9bVar.f;
                yhcVar.getClass();
                kq0.e();
                if (yhcVar.g) {
                    return;
                }
                fc0 fc0Var = yhcVar.a;
                fc0Var.getClass();
                kq0.e();
                int i = fc0Var.a;
                if (i > 0) {
                    z = true;
                    fc0Var.a = i - 1;
                } else {
                    z = false;
                }
                ImageCaptureException imageCaptureException = ec0Var.b;
                if (!z) {
                    kq0.e();
                    fc0Var.getClass();
                    fc0Var.b.execute(new flc(fc0Var, 26, imageCaptureException));
                }
                yhcVar.a();
                yhcVar.e.d(imageCaptureException);
                if (z) {
                    vje vjeVar = yhcVar.b;
                    vjeVar.getClass();
                    kq0.e();
                    vjeVar.a.addFirst(fc0Var);
                    vjeVar.c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(int r27, int r28, defpackage.zm5 r29, int r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l84.M(int, int, zm5, int, int, boolean):void");
    }

    public void N(View view, int i, int i2) {
        ym5 ym5Var = (ym5) view.getLayoutParams();
        int i3 = i - ((ViewGroup.MarginLayoutParams) ((bn5) ym5Var)).leftMargin;
        bn5 bn5Var = (bn5) ym5Var;
        int i4 = i3 - ((ViewGroup.MarginLayoutParams) bn5Var).rightMargin;
        xm5 xm5Var = (xm5) this.a;
        int iMin = Math.min(Math.max(i4 - ((FlexboxLayoutManager) xm5Var).Y0(view), bn5Var.t0), bn5Var.v0);
        long[] jArr = (long[]) this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        R(view, i2, iMakeMeasureSpec2, iMakeMeasureSpec);
        ((FlexboxLayoutManager) xm5Var).k1(view, i2);
    }

    public void O(View view, int i, int i2) {
        ym5 ym5Var = (ym5) view.getLayoutParams();
        int i3 = i - ((ViewGroup.MarginLayoutParams) ((bn5) ym5Var)).topMargin;
        bn5 bn5Var = (bn5) ym5Var;
        int i4 = i3 - ((ViewGroup.MarginLayoutParams) bn5Var).bottomMargin;
        xm5 xm5Var = (xm5) this.a;
        int iMin = Math.min(Math.max(i4 - ((FlexboxLayoutManager) xm5Var).Y0(view), bn5Var.u0), bn5Var.w0);
        long[] jArr = (long[]) this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        R(view, i2, iMakeMeasureSpec, iMakeMeasureSpec2);
        ((FlexboxLayoutManager) xm5Var).k1(view, i2);
    }

    public void P(int i) {
        View viewZ0;
        int i2;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) ((xm5) this.a);
        if (i >= flexboxLayoutManager.y.b()) {
            return;
        }
        int i3 = flexboxLayoutManager.p;
        if (flexboxLayoutManager.r != 4) {
            for (zm5 zm5Var : flexboxLayoutManager.v) {
                Iterator it = zm5Var.j.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View viewZ02 = flexboxLayoutManager.Z0(num.intValue());
                    if (i3 == 0 || i3 == 1) {
                        O(viewZ02, zm5Var.c, num.intValue());
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            throw new IllegalArgumentException(zr6.h(i3, "Invalid flex direction: "));
                        }
                        N(viewZ02, zm5Var.c, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.c;
        List list = flexboxLayoutManager.v;
        int size = list.size();
        for (int i4 = iArr != null ? iArr[i] : 0; i4 < size; i4++) {
            zm5 zm5Var2 = (zm5) list.get(i4);
            int i5 = zm5Var2.d;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = zm5Var2.k + i6;
                if (i6 < flexboxLayoutManager.y.b() && (viewZ0 = flexboxLayoutManager.Z0(i7)) != null && viewZ0.getVisibility() != 8 && ((i2 = ((bn5) ((ym5) viewZ0.getLayoutParams())).Z) == -1 || i2 == 4)) {
                    if (i3 == 0 || i3 == 1) {
                        O(viewZ0, zm5Var2.c, i7);
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            throw new IllegalArgumentException(zr6.h(i3, "Invalid flex direction: "));
                        }
                        N(viewZ0, zm5Var2.c, i7);
                    }
                }
            }
        }
    }

    public void Q(String str) {
        if (str == null) {
            ((LinkedHashMap) this.e).remove(Object.class);
            return;
        }
        if (((LinkedHashMap) this.e).isEmpty()) {
            this.e = new LinkedHashMap();
        }
        ((LinkedHashMap) this.e).put(Object.class, Object.class.cast(str));
    }

    public void R(View view, int i, int i2, int i3) {
        long[] jArr = (long[]) this.d;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = (long[]) this.e;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }

    public void S(String str) {
        if (eae.o0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (eae.o0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        od3 od3Var = new od3();
        od3Var.j(null, str);
        this.a = od3Var.b();
    }

    @Override // defpackage.lg
    public ph4 a(View view) {
        return new ph4(view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(f()).setDuration(200L).withStartAction(new mg(view, 1)));
    }

    @Override // defpackage.lg
    public long b() {
        return 200L;
    }

    @Override // defpackage.lg
    public ph4 c(View view) {
        return new ph4(view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(l()).setDuration(200L).withEndAction(new mg(view, 3)));
    }

    @Override // defpackage.lg
    public Interpolator d() {
        if (((vb5) this.b) == null) {
            this.b = new vb5(1);
        }
        return (vb5) this.b;
    }

    @Override // defpackage.lg
    public ph4 e(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200L);
        translateAnimation.setAnimationListener(new ng(2, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    @Override // defpackage.lg
    public Interpolator f() {
        if (((OvershootInterpolator) this.e) == null) {
            this.e = new OvershootInterpolator();
        }
        return (OvershootInterpolator) this.e;
    }

    @Override // defpackage.lg
    public ph4 g(View view) {
        return new ph4(view.animate().alpha(0.0f).setInterpolator(l()).setDuration(200L).withEndAction(new mg(view, 2)));
    }

    @Override // defpackage.lg
    public long h() {
        return 150L;
    }

    @Override // defpackage.lg
    public ph4 i(View view) {
        return new ph4(view.animate().alpha(1.0f).setInterpolator(d()).setDuration(200L).withStartAction(new mg(view, 0)));
    }

    @Override // defpackage.lg
    public ph4 j(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(d());
        translateAnimation.setDuration(200L);
        translateAnimation.setAnimationListener(new ng(0, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    @Override // defpackage.lg
    public Interpolator k() {
        if (((LinearInterpolator) this.a) == null) {
            this.a = new LinearInterpolator();
        }
        return (LinearInterpolator) this.a;
    }

    @Override // defpackage.lg
    public Interpolator l() {
        if (((vb5) this.c) == null) {
            this.c = new vb5(0);
        }
        return (vb5) this.c;
    }

    @Override // defpackage.lg
    public ph4 m(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setInterpolator(l());
        translateAnimation.setDuration(200L);
        translateAnimation.setAnimationListener(new ng(1, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    @Override // defpackage.lg
    public Interpolator n() {
        if (((wb5) this.d) == null) {
            this.d = new wb5();
        }
        return (wb5) this.d;
    }

    @Override // defpackage.lg
    public ph4 o(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setInterpolator(l());
        translateAnimation.setDuration(200L);
        translateAnimation.setAnimationListener(new ng(3, view));
        view.startAnimation(translateAnimation);
        return new ph4(translateAnimation);
    }

    public void p(List list, zm5 zm5Var, int i, int i2) {
        zm5Var.i = i2;
        ((xm5) this.a).getClass();
        zm5Var.l = i;
        list.add(zm5Var);
    }

    public void q(String str, String str2) {
        ((bj6) this.c).a(str, str2);
    }

    public mhc r() {
        vq6 vq6Var = (vq6) this.a;
        if (vq6Var == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = (String) this.b;
        cj6 cj6VarC = ((bj6) this.c).c();
        tfg tfgVar = (tfg) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        byte[] bArr = naf.a;
        return new mhc(vq6Var, str, cj6VarC, tfgVar, linkedHashMap.isEmpty() ? oz4.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0249 A[PHI: r21
      0x0249: PHI (r21v12 int) = (r21v5 int), (r21v5 int), (r21v6 int), (r21v5 int) binds: [B:97:0x0247, B:102:0x0255, B:134:0x032a, B:107:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(defpackage.wd6 r26, int r27, int r28, int r29, int r30, int r31, java.util.List r32) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l84.s(wd6, int, int, int, int, int, java.util.List):void");
    }

    public void t(View view, int i) {
        boolean z;
        ym5 ym5Var = (ym5) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        bn5 bn5Var = (bn5) ym5Var;
        int i2 = bn5Var.t0;
        boolean z2 = true;
        if (measuredWidth >= i2 && measuredWidth <= (i2 = bn5Var.v0)) {
            z = false;
        } else {
            measuredWidth = i2;
            z = true;
        }
        int i3 = bn5Var.u0;
        if (measuredHeight < i3) {
            measuredHeight = i3;
        } else {
            int i4 = bn5Var.w0;
            if (measuredHeight > i4) {
                measuredHeight = i4;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            R(view, i, iMakeMeasureSpec, iMakeMeasureSpec2);
            ((FlexboxLayoutManager) ((xm5) this.a)).k1(view, i);
        }
    }

    public void u(int i, List list) {
        int i2 = ((int[]) this.c)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public void v(int i, int i2, int i3) {
        int size;
        int iJ;
        int iK;
        Object obj = (xm5) this.a;
        int iB = ((FlexboxLayoutManager) obj).y.b();
        boolean[] zArr = (boolean[]) this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(iB, 10)];
        } else if (zArr.length < iB) {
            this.b = new boolean[Math.max(zArr.length * 2, iB)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= ((FlexboxLayoutManager) obj).y.b()) {
            return;
        }
        int i4 = ((FlexboxLayoutManager) obj).p;
        int i5 = ((FlexboxLayoutManager) obj).p;
        if (i5 == 0 || i5 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int iA1 = ((FlexboxLayoutManager) obj).a1();
            if (mode != 1073741824) {
                size = Math.min(iA1, size);
            }
            iJ = ((a) obj).J();
            iK = ((a) obj).K();
        } else {
            if (i5 != 2 && i5 != 3) {
                throw new IllegalArgumentException(zr6.h(i4, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = ((FlexboxLayoutManager) obj).a1();
            }
            iJ = ((a) obj).L();
            iK = ((a) obj).I();
        }
        int i6 = iK + iJ;
        int[] iArr = (int[]) this.c;
        List list = ((FlexboxLayoutManager) obj).v;
        int size2 = list.size();
        for (int i7 = iArr != null ? iArr[i3] : 0; i7 < size2; i7++) {
            zm5 zm5Var = (zm5) list.get(i7);
            int i8 = zm5Var.a;
            if (i8 < size && zm5Var.m) {
                z(i, i2, zm5Var, size, i6, false);
            } else if (i8 > size && zm5Var.n) {
                M(i, i2, zm5Var, size, i6, false);
            }
        }
    }

    public void w(int i) {
        int[] iArr = (int[]) this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf((int[]) this.c, Math.max(iArr.length * 2, i));
        }
    }

    public void x(int i) {
        long[] jArr = (long[]) this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf((long[]) this.d, Math.max(jArr.length * 2, i));
        }
    }

    public void y(int i) {
        long[] jArr = (long[]) this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf((long[]) this.e, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r26, int r27, defpackage.zm5 r28, int r29, int r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l84.z(int, int, zm5, int, int, boolean):void");
    }
}
