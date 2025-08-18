package androidx.emoji2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.ExtractEditText;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.bx4;
import defpackage.l3c;
import defpackage.mx4;
import defpackage.qy4;

/* loaded from: classes.dex */
public class EmojiExtractEditText extends ExtractEditText {
    public bx4 a;
    public final boolean b;

    public EmojiExtractEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.b) {
            return;
        }
        this.b = true;
        int i = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l3c.EmojiEditText, R.attr.editTextStyle, 0);
            int integer = typedArrayObtainStyledAttributes.getInteger(l3c.EmojiEditText_maxEmojiCount, Integer.MAX_VALUE);
            typedArrayObtainStyledAttributes.recycle();
            i = integer;
        }
        setMaxEmojiCount(i);
        setKeyListener(super.getKeyListener());
    }

    private bx4 getEmojiEditTextHelper() {
        if (this.a == null) {
            this.a = new bx4(this, true);
        }
        return this.a;
    }

    public int getEmojiReplaceStrategy() {
        return getEmojiEditTextHelper().c;
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().b;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().a(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiReplaceStrategy(int i) {
        bx4 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.c = i;
        ((qy4) emojiEditTextHelper.a.c).X = i;
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            getEmojiEditTextHelper().a.getClass();
            if (!(keyListener instanceof mx4) && !(keyListener instanceof NumberKeyListener)) {
                keyListener = new mx4(keyListener);
            }
        }
        super.setKeyListener(keyListener);
    }

    public void setMaxEmojiCount(int i) {
        bx4 emojiEditTextHelper = getEmojiEditTextHelper();
        emojiEditTextHelper.getClass();
        if (i < 0) {
            throw new IllegalArgumentException("maxEmojiCount should be greater than 0");
        }
        emojiEditTextHelper.b = i;
        ((qy4) emojiEditTextHelper.a.c).o = i;
    }
}
