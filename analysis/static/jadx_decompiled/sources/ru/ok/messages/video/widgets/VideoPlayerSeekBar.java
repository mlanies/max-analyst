package ru.ok.messages.video.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.b3c;
import defpackage.pn;
import defpackage.vsb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/messages/video/widgets/VideoPlayerSeekBar;", "Lpn;", "", "color", "Le5f;", "setProgressColor", "(I)V", "setThumbColor", "", "seekBarEnable", "setSeekBarEnable", "(Z)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class VideoPlayerSeekBar extends pn {
    public boolean b;

    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public final void setProgressColor(int color) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setSeekBarEnable(boolean seekBarEnable) {
        this.b = seekBarEnable;
    }

    public final void setThumbColor(int color) {
        Drawable thumb = getThumb();
        if (thumb != null) {
            thumb.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, vsb.seekBarStyle);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3c.VideoPlayerSeekBar);
            this.b = typedArrayObtainStyledAttributes.getBoolean(b3c.VideoPlayerSeekBar_seekBarEnable, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        setProgressColor(-1);
        setThumbColor(-1);
        Drawable thumb = getThumb();
        if (thumb == null || this.b) {
            return;
        }
        thumb.mutate().setAlpha(0);
        setSplitTrack(false);
    }
}
