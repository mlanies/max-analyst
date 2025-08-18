package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class zi3 {
    public static final SparseIntArray p0;
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public float d0;
    public int e;
    public float e0;
    public float f;
    public int f0;
    public boolean g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int[] i0;
    public int j;
    public String j0;
    public int k;
    public String k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public int o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public int z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p0 = sparseIntArray;
        sparseIntArray.append(i3c.Layout_layout_constraintLeft_toLeftOf, 24);
        sparseIntArray.append(i3c.Layout_layout_constraintLeft_toRightOf, 25);
        sparseIntArray.append(i3c.Layout_layout_constraintRight_toLeftOf, 28);
        sparseIntArray.append(i3c.Layout_layout_constraintRight_toRightOf, 29);
        sparseIntArray.append(i3c.Layout_layout_constraintTop_toTopOf, 35);
        sparseIntArray.append(i3c.Layout_layout_constraintTop_toBottomOf, 34);
        sparseIntArray.append(i3c.Layout_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(i3c.Layout_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(i3c.Layout_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(i3c.Layout_layout_editor_absoluteX, 6);
        sparseIntArray.append(i3c.Layout_layout_editor_absoluteY, 7);
        sparseIntArray.append(i3c.Layout_layout_constraintGuide_begin, 17);
        sparseIntArray.append(i3c.Layout_layout_constraintGuide_end, 18);
        sparseIntArray.append(i3c.Layout_layout_constraintGuide_percent, 19);
        sparseIntArray.append(i3c.Layout_guidelineUseRtl, 90);
        sparseIntArray.append(i3c.Layout_android_orientation, 26);
        sparseIntArray.append(i3c.Layout_layout_constraintStart_toEndOf, 31);
        sparseIntArray.append(i3c.Layout_layout_constraintStart_toStartOf, 32);
        sparseIntArray.append(i3c.Layout_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(i3c.Layout_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(i3c.Layout_layout_goneMarginLeft, 13);
        sparseIntArray.append(i3c.Layout_layout_goneMarginTop, 16);
        sparseIntArray.append(i3c.Layout_layout_goneMarginRight, 14);
        sparseIntArray.append(i3c.Layout_layout_goneMarginBottom, 11);
        sparseIntArray.append(i3c.Layout_layout_goneMarginStart, 15);
        sparseIntArray.append(i3c.Layout_layout_goneMarginEnd, 12);
        sparseIntArray.append(i3c.Layout_layout_constraintVertical_weight, 38);
        sparseIntArray.append(i3c.Layout_layout_constraintHorizontal_weight, 37);
        sparseIntArray.append(i3c.Layout_layout_constraintHorizontal_chainStyle, 39);
        sparseIntArray.append(i3c.Layout_layout_constraintVertical_chainStyle, 40);
        sparseIntArray.append(i3c.Layout_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(i3c.Layout_layout_constraintVertical_bias, 36);
        sparseIntArray.append(i3c.Layout_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(i3c.Layout_layout_constraintLeft_creator, 91);
        sparseIntArray.append(i3c.Layout_layout_constraintTop_creator, 91);
        sparseIntArray.append(i3c.Layout_layout_constraintRight_creator, 91);
        sparseIntArray.append(i3c.Layout_layout_constraintBottom_creator, 91);
        sparseIntArray.append(i3c.Layout_layout_constraintBaseline_creator, 91);
        sparseIntArray.append(i3c.Layout_android_layout_marginLeft, 23);
        sparseIntArray.append(i3c.Layout_android_layout_marginRight, 27);
        sparseIntArray.append(i3c.Layout_android_layout_marginStart, 30);
        sparseIntArray.append(i3c.Layout_android_layout_marginEnd, 8);
        sparseIntArray.append(i3c.Layout_android_layout_marginTop, 33);
        sparseIntArray.append(i3c.Layout_android_layout_marginBottom, 2);
        sparseIntArray.append(i3c.Layout_android_layout_width, 22);
        sparseIntArray.append(i3c.Layout_android_layout_height, 21);
        sparseIntArray.append(i3c.Layout_layout_constraintWidth, 41);
        sparseIntArray.append(i3c.Layout_layout_constraintHeight, 42);
        sparseIntArray.append(i3c.Layout_layout_constrainedWidth, 41);
        sparseIntArray.append(i3c.Layout_layout_constrainedHeight, 42);
        sparseIntArray.append(i3c.Layout_layout_wrapBehaviorInParent, 76);
        sparseIntArray.append(i3c.Layout_layout_constraintCircle, 61);
        sparseIntArray.append(i3c.Layout_layout_constraintCircleRadius, 62);
        sparseIntArray.append(i3c.Layout_layout_constraintCircleAngle, 63);
        sparseIntArray.append(i3c.Layout_layout_constraintWidth_percent, 69);
        sparseIntArray.append(i3c.Layout_layout_constraintHeight_percent, 70);
        sparseIntArray.append(i3c.Layout_chainUseRtl, 71);
        sparseIntArray.append(i3c.Layout_barrierDirection, 72);
        sparseIntArray.append(i3c.Layout_barrierMargin, 73);
        sparseIntArray.append(i3c.Layout_constraint_referenced_ids, 74);
        sparseIntArray.append(i3c.Layout_barrierAllowsGoneWidgets, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3c.Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = p0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.p = dj3.i(typedArrayObtainStyledAttributes, index, this.p);
                    break;
                case 2:
                    this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 3:
                    this.o = dj3.i(typedArrayObtainStyledAttributes, index, this.o);
                    break;
                case 4:
                    this.n = dj3.i(typedArrayObtainStyledAttributes, index, this.n);
                    break;
                case 5:
                    this.y = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                case 7:
                    this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 8:
                    this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 9:
                    this.v = dj3.i(typedArrayObtainStyledAttributes, index, this.v);
                    break;
                case 10:
                    this.u = dj3.i(typedArrayObtainStyledAttributes, index, this.u);
                    break;
                case 11:
                    this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 13:
                    this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 16:
                    this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                    break;
                case 18:
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 19:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 20:
                    this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                    break;
                case 21:
                    this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case 22:
                    this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.b);
                    break;
                case 23:
                    this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    this.h = dj3.i(typedArrayObtainStyledAttributes, index, this.h);
                    break;
                case 25:
                    this.i = dj3.i(typedArrayObtainStyledAttributes, index, this.i);
                    break;
                case 26:
                    this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                    break;
                case 27:
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 28:
                    this.j = dj3.i(typedArrayObtainStyledAttributes, index, this.j);
                    break;
                case 29:
                    this.k = dj3.i(typedArrayObtainStyledAttributes, index, this.k);
                    break;
                case 30:
                    this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 31:
                    this.s = dj3.i(typedArrayObtainStyledAttributes, index, this.s);
                    break;
                case 32:
                    this.t = dj3.i(typedArrayObtainStyledAttributes, index, this.t);
                    break;
                case 33:
                    this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case 34:
                    this.m = dj3.i(typedArrayObtainStyledAttributes, index, this.m);
                    break;
                case 35:
                    this.l = dj3.i(typedArrayObtainStyledAttributes, index, this.l);
                    break;
                case 36:
                    this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 38:
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                    break;
                case 39:
                    this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                    break;
                case 41:
                    dj3.j(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case 42:
                    dj3.j(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            this.z = dj3.i(typedArrayObtainStyledAttributes, index, this.z);
                            break;
                        case 62:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            break;
                        case 63:
                            this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    this.f0 = typedArrayObtainStyledAttributes.getInt(index, this.f0);
                                    break;
                                case 73:
                                    this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                    break;
                                case 74:
                                    this.j0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case 76:
                                    this.o0 = typedArrayObtainStyledAttributes.getInt(index, this.o0);
                                    break;
                                case 77:
                                    this.q = dj3.i(typedArrayObtainStyledAttributes, index, this.q);
                                    break;
                                case 78:
                                    this.r = dj3.i(typedArrayObtainStyledAttributes, index, this.r);
                                    break;
                                case 79:
                                    this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                case 80:
                                    this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    break;
                                case 81:
                                    this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 82:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 83:
                                    this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 84:
                                    this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 85:
                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 86:
                                    this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 87:
                                    this.l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.l0);
                                    break;
                                case 88:
                                    this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                    break;
                                case 89:
                                    this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.g = typedArrayObtainStyledAttributes.getBoolean(index, this.g);
                                    break;
                                case 91:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
