package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.b3c;
import defpackage.g13;
import defpackage.re;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Chronometer extends AppCompatTextView {
    public Formatter A0;
    public Locale B0;
    public final Object[] C0;
    public StringBuilder D0;
    public final StringBuilder E0;
    public boolean F0;
    public final re G0;
    public long u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public String z0;

    public Chronometer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.C0 = new Object[1];
        this.E0 = new StringBuilder(8);
        this.G0 = new re(10, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3c.Chronometer, 0, 0);
        setFormat(typedArrayObtainStyledAttributes.getString(b3c.Chronometer_format));
        setCountDown(typedArrayObtainStyledAttributes.getBoolean(b3c.Chronometer_countDown, false));
        typedArrayObtainStyledAttributes.recycle();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.u0 = jElapsedRealtime;
        k(jElapsedRealtime);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Chronometer.class.getName();
    }

    public long getBase() {
        return this.u0;
    }

    public String getFormat() {
        return this.z0;
    }

    public g13 getOnChronometerTickListener() {
        return null;
    }

    public final void j() {
        boolean z = this.v0 && this.w0 && isShown();
        if (z != this.x0) {
            re reVar = this.G0;
            if (z) {
                k(SystemClock.elapsedRealtime());
                postDelayed(reVar, 1000L);
            } else {
                removeCallbacks(reVar);
            }
            this.x0 = z;
        }
    }

    public final synchronized void k(long j) {
        try {
            long j2 = (this.F0 ? this.u0 - j : j - this.u0) / 1000;
            if (j2 < 0) {
                j2 = -j2;
            }
            String elapsedTime = DateUtils.formatElapsedTime(this.E0, j2);
            if (this.z0 != null) {
                Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
                if (this.A0 == null || !locale.equals(this.B0)) {
                    this.B0 = locale;
                    this.A0 = new Formatter(this.D0, locale);
                }
                this.D0.setLength(0);
                Object[] objArr = this.C0;
                objArr[0] = elapsedTime;
                try {
                    this.A0.format(this.z0, objArr);
                    elapsedTime = this.D0.toString();
                } catch (IllegalFormatException unused) {
                    if (!this.y0) {
                        this.y0 = true;
                    }
                }
            }
            setText(elapsedTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0 = false;
        j();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.v0 = i == 0;
        j();
    }

    public void setBase(long j) {
        this.u0 = j;
        k(SystemClock.elapsedRealtime());
    }

    public void setCountDown(boolean z) {
        this.F0 = z;
        k(SystemClock.elapsedRealtime());
    }

    public void setFormat(String str) {
        this.z0 = str;
        if (str == null || this.D0 != null) {
            return;
        }
        this.D0 = new StringBuilder(str.length() * 2);
    }

    public void setOnChronometerTickListener(g13 g13Var) {
    }

    public void setStarted(boolean z) {
        this.w0 = z;
        j();
    }
}
