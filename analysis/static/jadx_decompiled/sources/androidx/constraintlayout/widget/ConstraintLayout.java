package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dj3;
import defpackage.dob;
import defpackage.fh6;
import defpackage.hj3;
import defpackage.i3c;
import defpackage.ij3;
import defpackage.lj3;
import defpackage.qz7;
import defpackage.ri3;
import defpackage.si3;
import defpackage.ti3;
import defpackage.uld;
import defpackage.zh7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static uld F0;
    public HashMap A0;
    public final SparseArray B0;
    public final dob C0;
    public int D0;
    public int E0;
    public final SparseArray a;
    public final ArrayList b;
    public final ij3 c;
    public int o;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public int w0;
    public dj3 x0;
    public qz7 y0;
    public int z0;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ij3();
        this.o = 0;
        this.s0 = 0;
        this.t0 = Integer.MAX_VALUE;
        this.u0 = Integer.MAX_VALUE;
        this.v0 = true;
        this.w0 = 257;
        this.x0 = null;
        this.y0 = null;
        this.z0 = -1;
        this.A0 = new HashMap();
        this.B0 = new SparseArray();
        this.C0 = new dob(this, this);
        this.D0 = 0;
        this.E0 = 0;
        r(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static uld getSharedValues() {
        if (F0 == null) {
            uld uldVar = new uld();
            new SparseIntArray();
            new HashMap();
            F0 = uldVar;
        }
        return F0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ti3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ri3) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.v0 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ti3(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ti3 ti3Var = new ti3(context, attributeSet);
        ti3Var.a = -1;
        ti3Var.b = -1;
        ti3Var.c = -1.0f;
        ti3Var.d = true;
        ti3Var.e = -1;
        ti3Var.f = -1;
        ti3Var.g = -1;
        ti3Var.h = -1;
        ti3Var.i = -1;
        ti3Var.j = -1;
        ti3Var.k = -1;
        ti3Var.l = -1;
        ti3Var.m = -1;
        ti3Var.n = -1;
        ti3Var.o = -1;
        ti3Var.p = -1;
        ti3Var.q = 0;
        ti3Var.r = 0.0f;
        ti3Var.s = -1;
        ti3Var.t = -1;
        ti3Var.u = -1;
        ti3Var.v = -1;
        ti3Var.w = Integer.MIN_VALUE;
        ti3Var.x = Integer.MIN_VALUE;
        ti3Var.y = Integer.MIN_VALUE;
        ti3Var.z = Integer.MIN_VALUE;
        ti3Var.A = Integer.MIN_VALUE;
        ti3Var.B = Integer.MIN_VALUE;
        ti3Var.C = Integer.MIN_VALUE;
        ti3Var.D = 0;
        ti3Var.E = 0.5f;
        ti3Var.F = 0.5f;
        ti3Var.G = null;
        ti3Var.H = -1.0f;
        ti3Var.I = -1.0f;
        ti3Var.J = 0;
        ti3Var.K = 0;
        ti3Var.L = 0;
        ti3Var.M = 0;
        ti3Var.N = 0;
        ti3Var.O = 0;
        ti3Var.P = 0;
        ti3Var.Q = 0;
        ti3Var.R = 1.0f;
        ti3Var.S = 1.0f;
        ti3Var.T = -1;
        ti3Var.U = -1;
        ti3Var.V = -1;
        ti3Var.W = false;
        ti3Var.X = false;
        ti3Var.Y = null;
        ti3Var.Z = 0;
        ti3Var.a0 = true;
        ti3Var.b0 = true;
        ti3Var.c0 = false;
        ti3Var.d0 = false;
        ti3Var.e0 = false;
        ti3Var.f0 = -1;
        ti3Var.g0 = -1;
        ti3Var.h0 = -1;
        ti3Var.i0 = -1;
        ti3Var.j0 = Integer.MIN_VALUE;
        ti3Var.k0 = Integer.MIN_VALUE;
        ti3Var.l0 = 0.5f;
        ti3Var.p0 = new hj3();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = si3.a.get(index);
            switch (i2) {
                case 1:
                    ti3Var.V = typedArrayObtainStyledAttributes.getInt(index, ti3Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.p);
                    ti3Var.p = resourceId;
                    if (resourceId == -1) {
                        ti3Var.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    ti3Var.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, ti3Var.r) % 360.0f;
                    ti3Var.r = f;
                    if (f < 0.0f) {
                        ti3Var.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    ti3Var.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ti3Var.a);
                    break;
                case 6:
                    ti3Var.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ti3Var.b);
                    break;
                case 7:
                    ti3Var.c = typedArrayObtainStyledAttributes.getFloat(index, ti3Var.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.e);
                    ti3Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        ti3Var.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.f);
                    ti3Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        ti3Var.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.g);
                    ti3Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        ti3Var.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.h);
                    ti3Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        ti3Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.i);
                    ti3Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        ti3Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.j);
                    ti3Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        ti3Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.k);
                    ti3Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        ti3Var.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.l);
                    ti3Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        ti3Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.m);
                    ti3Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        ti3Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case LangUtils.HASH_SEED /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.s);
                    ti3Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        ti3Var.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.t);
                    ti3Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        ti3Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.u);
                    ti3Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        ti3Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.v);
                    ti3Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        ti3Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    ti3Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.w);
                    break;
                case 22:
                    ti3Var.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.x);
                    break;
                case 23:
                    ti3Var.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.y);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    ti3Var.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.z);
                    break;
                case 25:
                    ti3Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.A);
                    break;
                case 26:
                    ti3Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.B);
                    break;
                case 27:
                    ti3Var.W = typedArrayObtainStyledAttributes.getBoolean(index, ti3Var.W);
                    break;
                case 28:
                    ti3Var.X = typedArrayObtainStyledAttributes.getBoolean(index, ti3Var.X);
                    break;
                case 29:
                    ti3Var.E = typedArrayObtainStyledAttributes.getFloat(index, ti3Var.E);
                    break;
                case 30:
                    ti3Var.F = typedArrayObtainStyledAttributes.getFloat(index, ti3Var.F);
                    break;
                case 31:
                    ti3Var.L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    ti3Var.M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        ti3Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ti3Var.N) == -2) {
                            ti3Var.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        ti3Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ti3Var.P) == -2) {
                            ti3Var.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    ti3Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, ti3Var.R));
                    ti3Var.L = 2;
                    break;
                case 36:
                    try {
                        ti3Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ti3Var.O) == -2) {
                            ti3Var.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case LangUtils.HASH_OFFSET /* 37 */:
                    try {
                        ti3Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, ti3Var.Q) == -2) {
                            ti3Var.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    ti3Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, ti3Var.S));
                    ti3Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            dj3.k(ti3Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            ti3Var.H = typedArrayObtainStyledAttributes.getFloat(index, ti3Var.H);
                            break;
                        case 46:
                            ti3Var.I = typedArrayObtainStyledAttributes.getFloat(index, ti3Var.I);
                            break;
                        case 47:
                            ti3Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            ti3Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            ti3Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ti3Var.T);
                            break;
                        case 50:
                            ti3Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ti3Var.U);
                            break;
                        case 51:
                            ti3Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.n);
                            ti3Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                ti3Var.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, ti3Var.o);
                            ti3Var.o = resourceId16;
                            if (resourceId16 == -1) {
                                ti3Var.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            ti3Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.D);
                            break;
                        case 55:
                            ti3Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ti3Var.C);
                            break;
                        default:
                            switch (i2) {
                                case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                                    dj3.j(ti3Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    dj3.j(ti3Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    ti3Var.Z = typedArrayObtainStyledAttributes.getInt(index, ti3Var.Z);
                                    break;
                                case 67:
                                    ti3Var.d = typedArrayObtainStyledAttributes.getBoolean(index, ti3Var.d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        ti3Var.a();
        return ti3Var;
    }

    public int getMaxHeight() {
        return this.u0;
    }

    public int getMaxWidth() {
        return this.t0;
    }

    public int getMinHeight() {
        return this.s0;
    }

    public int getMinWidth() {
        return this.o;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        ij3 ij3Var = this.c;
        if (ij3Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                ij3Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                ij3Var.j = "parent";
            }
        }
        if (ij3Var.h0 == null) {
            ij3Var.h0 = ij3Var.j;
        }
        Iterator it = ij3Var.q0.iterator();
        while (it.hasNext()) {
            hj3 hj3Var = (hj3) it.next();
            View view = (View) hj3Var.f0;
            if (view != null) {
                if (hj3Var.j == null && (id = view.getId()) != -1) {
                    hj3Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (hj3Var.h0 == null) {
                    hj3Var.h0 = hj3Var.j;
                }
            }
        }
        ij3Var.n(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ti3 ti3Var = (ti3) childAt.getLayoutParams();
            hj3 hj3Var = ti3Var.p0;
            if (childAt.getVisibility() != 8 || ti3Var.d0 || ti3Var.e0 || zIsInEditMode) {
                int iR = hj3Var.r();
                int iS = hj3Var.s();
                childAt.layout(iR, iS, hj3Var.q() + iR, hj3Var.k() + iS);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ri3) arrayList.get(i6)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0520  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r24, int r25) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        hj3 hj3VarQ = q(view);
        if ((view instanceof Guideline) && !(hj3VarQ instanceof fh6)) {
            ti3 ti3Var = (ti3) view.getLayoutParams();
            fh6 fh6Var = new fh6();
            ti3Var.p0 = fh6Var;
            ti3Var.d0 = true;
            fh6Var.S(ti3Var.V);
        }
        if (view instanceof ri3) {
            ri3 ri3Var = (ri3) view;
            ri3Var.k();
            ((ti3) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(ri3Var)) {
                arrayList.add(ri3Var);
            }
        }
        this.a.put(view.getId(), view);
        this.v0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        hj3 hj3VarQ = q(view);
        this.c.q0.remove(hj3VarQ);
        hj3VarQ.C();
        this.b.remove(view);
        this.v0 = true;
    }

    public final hj3 q(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof ti3) {
            return ((ti3) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof ti3) {
            return ((ti3) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void r(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        ij3 ij3Var = this.c;
        ij3Var.f0 = this;
        dob dobVar = this.C0;
        ij3Var.u0 = dobVar;
        ij3Var.s0.g = dobVar;
        this.a.put(getId(), this);
        this.x0 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i3c.ConstraintLayout_Layout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == i3c.ConstraintLayout_Layout_android_minWidth) {
                    this.o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.o);
                } else if (index == i3c.ConstraintLayout_Layout_android_minHeight) {
                    this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.s0);
                } else if (index == i3c.ConstraintLayout_Layout_android_maxWidth) {
                    this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.t0);
                } else if (index == i3c.ConstraintLayout_Layout_android_maxHeight) {
                    this.u0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.u0);
                } else if (index == i3c.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.w0 = typedArrayObtainStyledAttributes.getInt(index, this.w0);
                } else if (index == i3c.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.y0 = null;
                        }
                    }
                } else if (index == i3c.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        dj3 dj3Var = new dj3();
                        this.x0 = dj3Var;
                        dj3Var.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.x0 = null;
                    }
                    this.z0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ij3Var.D0 = this.w0;
        zh7.p = ij3Var.W(512);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.v0 = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r9 = this;
            qz7 r0 = new qz7
            android.content.Context r1 = r9.getContext()
            r2 = 13
            r3 = 0
            r0.<init>(r2, r3)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3 = 0
        L27:
            r4 = 1
            if (r2 == r4) goto Lae
            if (r2 == 0) goto L9f
            r5 = 2
            if (r2 == r5) goto L31
            goto La2
        L31:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6b;
                case 80204913: goto L61;
                case 1382829617: goto L58;
                case 1657696882: goto L4e;
                case 1901439077: goto L3f;
                default: goto L3e;
            }     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        L3e:
            goto L75
        L3f:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r8
            goto L76
        L49:
            r10 = move-exception
            goto La7
        L4b:
            r10 = move-exception
            goto Lab
        L4e:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = 0
            goto L76
        L58:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            goto L76
        L61:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r5
            goto L76
        L6b:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r2 == 0) goto L75
            r4 = r7
            goto L76
        L75:
            r4 = -1
        L76:
            if (r4 == r5) goto L90
            if (r4 == r8) goto L81
            if (r4 == r7) goto L7d
            goto La2
        L7d:
            r0.U(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L81:
            ui3 r2 = new ui3     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r3 == 0) goto La2
            java.lang.Object r4 = r3.o     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r4.add(r2)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L90:
            l2a r3 = new l2a     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.Object r2 = r0.b     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            int r4 = r3.b     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.put(r4, r3)     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto La2
        L9f:
            r10.getName()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
        La2:
            int r2 = r10.next()     // Catch: java.io.IOException -> L49 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L27
        La7:
            r10.printStackTrace()
            goto Lae
        Lab:
            r10.printStackTrace()
        Lae:
            r9.y0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.s(int):void");
    }

    public void setConstraintSet(dj3 dj3Var) {
        this.x0 = dj3Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.u0) {
            return;
        }
        this.u0 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.t0) {
            return;
        }
        this.t0 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.s0) {
            return;
        }
        this.s0 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.o) {
            return;
        }
        this.o = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(lj3 lj3Var) {
        qz7 qz7Var = this.y0;
        if (qz7Var != null) {
            qz7Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.w0 = i;
        ij3 ij3Var = this.c;
        ij3Var.D0 = i;
        zh7.p = ij3Var.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x04db A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.ij3 r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.t(ij3, int, int, int):void");
    }

    public final void v(hj3 hj3Var, ti3 ti3Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        hj3 hj3Var2 = (hj3) sparseArray.get(i);
        if (hj3Var2 == null || view == null || !(view.getLayoutParams() instanceof ti3)) {
            return;
        }
        ti3Var.c0 = true;
        if (i2 == 6) {
            ti3 ti3Var2 = (ti3) view.getLayoutParams();
            ti3Var2.c0 = true;
            ti3Var2.p0.E = true;
        }
        hj3Var.i(6).b(hj3Var2.i(i2), ti3Var.D, ti3Var.C, true);
        hj3Var.E = true;
        hj3Var.i(3).j();
        hj3Var.i(5).j();
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ij3();
        this.o = 0;
        this.s0 = 0;
        this.t0 = Integer.MAX_VALUE;
        this.u0 = Integer.MAX_VALUE;
        this.v0 = true;
        this.w0 = 257;
        this.x0 = null;
        this.y0 = null;
        this.z0 = -1;
        this.A0 = new HashMap();
        this.B0 = new SparseArray();
        this.C0 = new dob(this, this);
        this.D0 = 0;
        this.E0 = 0;
        r(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ij3();
        this.o = 0;
        this.s0 = 0;
        this.t0 = Integer.MAX_VALUE;
        this.u0 = Integer.MAX_VALUE;
        this.v0 = true;
        this.w0 = 257;
        this.x0 = null;
        this.y0 = null;
        this.z0 = -1;
        this.A0 = new HashMap();
        this.B0 = new SparseArray();
        this.C0 = new dob(this, this);
        this.D0 = 0;
        this.E0 = 0;
        r(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ti3 ti3Var = new ti3(layoutParams);
        ti3Var.a = -1;
        ti3Var.b = -1;
        ti3Var.c = -1.0f;
        ti3Var.d = true;
        ti3Var.e = -1;
        ti3Var.f = -1;
        ti3Var.g = -1;
        ti3Var.h = -1;
        ti3Var.i = -1;
        ti3Var.j = -1;
        ti3Var.k = -1;
        ti3Var.l = -1;
        ti3Var.m = -1;
        ti3Var.n = -1;
        ti3Var.o = -1;
        ti3Var.p = -1;
        ti3Var.q = 0;
        ti3Var.r = 0.0f;
        ti3Var.s = -1;
        ti3Var.t = -1;
        ti3Var.u = -1;
        ti3Var.v = -1;
        ti3Var.w = Integer.MIN_VALUE;
        ti3Var.x = Integer.MIN_VALUE;
        ti3Var.y = Integer.MIN_VALUE;
        ti3Var.z = Integer.MIN_VALUE;
        ti3Var.A = Integer.MIN_VALUE;
        ti3Var.B = Integer.MIN_VALUE;
        ti3Var.C = Integer.MIN_VALUE;
        ti3Var.D = 0;
        ti3Var.E = 0.5f;
        ti3Var.F = 0.5f;
        ti3Var.G = null;
        ti3Var.H = -1.0f;
        ti3Var.I = -1.0f;
        ti3Var.J = 0;
        ti3Var.K = 0;
        ti3Var.L = 0;
        ti3Var.M = 0;
        ti3Var.N = 0;
        ti3Var.O = 0;
        ti3Var.P = 0;
        ti3Var.Q = 0;
        ti3Var.R = 1.0f;
        ti3Var.S = 1.0f;
        ti3Var.T = -1;
        ti3Var.U = -1;
        ti3Var.V = -1;
        ti3Var.W = false;
        ti3Var.X = false;
        ti3Var.Y = null;
        ti3Var.Z = 0;
        ti3Var.a0 = true;
        ti3Var.b0 = true;
        ti3Var.c0 = false;
        ti3Var.d0 = false;
        ti3Var.e0 = false;
        ti3Var.f0 = -1;
        ti3Var.g0 = -1;
        ti3Var.h0 = -1;
        ti3Var.i0 = -1;
        ti3Var.j0 = Integer.MIN_VALUE;
        ti3Var.k0 = Integer.MIN_VALUE;
        ti3Var.l0 = 0.5f;
        ti3Var.p0 = new hj3();
        return ti3Var;
    }
}
