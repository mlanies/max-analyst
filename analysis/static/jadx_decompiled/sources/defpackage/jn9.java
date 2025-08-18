package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jn9 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public jn9(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent viewParentF;
        if (!this.d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return tof.a(viewParentF, this.c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentF);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent viewParentF;
        if (!this.d || (viewParentF = f(0)) == null) {
            return false;
        }
        try {
            return tof.b(viewParentF, this.c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParentF);
            return false;
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentF;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (viewParentF = f(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            int i6 = iArr2[0];
            i5 = iArr2[1];
            i4 = i6;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z = viewParentF instanceof kn9;
        View view2 = this.c;
        if (z) {
            ((kn9) viewParentF).n(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                tof.c(viewParentF, view2, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentF);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i, int i2, int i3, int[] iArr) {
        e(0, i, 0, i2, null, i3, iArr);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentF;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (viewParentF = f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z = viewParentF instanceof ln9;
        View view2 = this.c;
        if (z) {
            ((ln9) viewParentF).i(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentF instanceof kn9) {
                ((kn9) viewParentF).j(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    tof.d(viewParentF, view2, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentF);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean g(int i) {
        return f(i) != null;
    }

    public final boolean h(int i, int i2) {
        boolean zF;
        if (g(i2)) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof kn9;
                if (z) {
                    zF = ((kn9) parent).k(view2, view, i, i2);
                } else if (i2 == 0) {
                    try {
                        zF = tof.f(parent, view2, view, i);
                    } catch (AbstractMethodError unused) {
                        Objects.toString(parent);
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i2 == 0) {
                        this.a = parent;
                    } else if (i2 == 1) {
                        this.b = parent;
                    }
                    if (z) {
                        ((kn9) parent).l(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            tof.e(parent, view2, view, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent viewParentF = f(i);
        if (viewParentF != null) {
            boolean z = viewParentF instanceof kn9;
            View view = this.c;
            if (z) {
                ((kn9) viewParentF).m(view, i);
            } else if (i == 0) {
                try {
                    tof.g(viewParentF, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentF);
                }
            }
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
