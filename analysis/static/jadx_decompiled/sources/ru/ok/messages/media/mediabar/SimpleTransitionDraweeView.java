package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes2.dex */
public class SimpleTransitionDraweeView extends SimpleDraweeView {
    public SimpleTransitionDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            getDrawable().setBounds(0, 0, getWidth(), getHeight());
        }
        super.onDraw(canvas);
    }
}
