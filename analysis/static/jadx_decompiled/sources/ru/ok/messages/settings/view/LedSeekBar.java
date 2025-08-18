package ru.ok.messages.settings.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.SeekBar;
import defpackage.bk4;
import defpackage.d74;
import defpackage.fpc;
import defpackage.g6;
import defpackage.pn;
import defpackage.ve7;
import defpackage.vl;
import defpackage.we7;
import defpackage.y8a;
import ru.ok.messages.settings.FrgBaseSettings;

/* loaded from: classes2.dex */
public class LedSeekBar extends pn implements SeekBar.OnSeekBarChangeListener {
    public final int b;
    public ve7 c;
    public final int[] o;
    public final ShapeDrawable s0;

    public LedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = ((y8a) vl.b()).n().c.w();
        getContext();
        bk4 bk4VarB = bk4.b();
        int i = bk4VarB.n;
        this.b = bk4VarB.b;
        int dimension = (int) getResources().getDimension(fpc.d);
        setPadding(dimension, 0, dimension, 0);
        setProgressDrawable(new g6(this));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.s0 = shapeDrawable;
        shapeDrawable.setBounds(0, 0, i, i);
        this.s0.setIntrinsicHeight(i);
        this.s0.setIntrinsicWidth(i);
        setThumb(this.s0);
        setThumbOffset(i / 2);
        setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int[] iArr = this.o;
        int length = (int) ((iArr.length / getMax()) * i);
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        this.s0.getPaint().setColor(this.o[length]);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = getProgress();
        int[] iArr = this.o;
        int length = (int) ((iArr.length / getMax()) * progress);
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        float max = getMax() / this.o.length;
        setProgress((int) ((max / 2.0f) + (length * max)));
        ve7 ve7Var = this.c;
        if (ve7Var != null) {
            int i = this.o[length];
            d74 d74Var = (d74) ve7Var;
            we7 we7Var = (we7) d74Var.b;
            FrgBaseSettings frgBaseSettings = (FrgBaseSettings) d74Var.c;
            if (frgBaseSettings != null) {
                frgBaseSettings.u1(we7Var.L0.a, Integer.valueOf(i));
            } else {
                we7Var.getClass();
            }
        }
    }

    public void setColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length) {
                break;
            }
            if (i == iArr[i3]) {
                i2 = i3;
                break;
            }
            i3++;
        }
        float max = getMax() / this.o.length;
        setProgress((int) ((max / 2.0f) + (i2 * max)));
    }

    public void setListener(ve7 ve7Var) {
        this.c = ve7Var;
    }
}
