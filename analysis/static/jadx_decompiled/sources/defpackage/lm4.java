package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class lm4 extends ndc {
    public static final int[] X = {R.attr.listDivider};
    public final /* synthetic */ int a;
    public final int b;
    public Object c;
    public final Object o;

    public lm4(Context context) {
        this.a = 0;
        this.o = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X);
        this.c = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.b = 1;
    }

    @Override // defpackage.ndc
    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdcVar) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    if (this.b != 1) {
                        rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                        break;
                    } else {
                        rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                        break;
                    }
                } else {
                    rect.set(0, 0, 0, 0);
                    break;
                }
            default:
                recyclerView.getClass();
                int iR = RecyclerView.R(view);
                if (iR != -1) {
                    int i = ((o1d) this.c).i(iR);
                    int i2 = i != 0 ? r1d.$EnumSwitchMapping$0[au1.s(i)] : -1;
                    int i3 = this.b;
                    bi9 bi9Var = (bi9) this.o;
                    if (i2 == 1) {
                        if (iR != 0) {
                            rect.top = tu0.G(i3 * fk4.d().getDisplayMetrics().density);
                        }
                        bi9Var.a(iR);
                        break;
                    } else if (i2 == 2) {
                        if (iR != 0) {
                            rect.top = tu0.G(i3 * fk4.d().getDisplayMetrics().density);
                        }
                        bi9Var.a(iR);
                        break;
                    } else {
                        bi9Var.h(iR);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ndc
    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdcVar) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        switch (this.a) {
            case 0:
                if (recyclerView.getLayoutManager() != null && ((Drawable) this.c) != null) {
                    int i = this.b;
                    Rect rect = (Rect) this.o;
                    int i2 = 0;
                    if (i != 1) {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            paddingTop = recyclerView.getPaddingTop();
                            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                        } else {
                            height = recyclerView.getHeight();
                            paddingTop = 0;
                        }
                        int childCount = recyclerView.getChildCount();
                        while (i2 < childCount) {
                            View childAt = recyclerView.getChildAt(i2);
                            recyclerView.getLayoutManager().A(rect, childAt);
                            int iRound = Math.round(childAt.getTranslationX()) + rect.right;
                            ((Drawable) this.c).setBounds(iRound - ((Drawable) this.c).getIntrinsicWidth(), paddingTop, iRound, height);
                            ((Drawable) this.c).draw(canvas);
                            i2++;
                        }
                        canvas.restore();
                        break;
                    } else {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            paddingLeft = recyclerView.getPaddingLeft();
                            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        } else {
                            width = recyclerView.getWidth();
                            paddingLeft = 0;
                        }
                        int childCount2 = recyclerView.getChildCount();
                        while (i2 < childCount2) {
                            View childAt2 = recyclerView.getChildAt(i2);
                            RecyclerView.V(rect, childAt2);
                            int iRound2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
                            ((Drawable) this.c).setBounds(paddingLeft, iRound2 - ((Drawable) this.c).getIntrinsicHeight(), width, iRound2);
                            ((Drawable) this.c).draw(canvas);
                            i2++;
                        }
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }

    public lm4(bkg bkgVar, int i) {
        this.a = 1;
        this.c = bkgVar;
        this.b = i;
        bi9 bi9Var = k37.a;
        this.o = new bi9();
    }
}
