package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class l09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l09 l09Var = (l09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l09 l09Var = new l09(continuation, this.Y);
        l09Var.X = obj;
        return l09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rce rceVar = (rce) this.X;
        int i = rceVar.Z;
        e5f e5fVar = e5f.a;
        e5f e5fVar2 = null;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (i == 3) {
            bc7[] bc7VarArr = MessageWriteWidget.F0;
            xz8 xz8VarV0 = messageWriteWidget.v0();
            CharSequence charSequenceK = rceVar.k();
            bc7[] bc7VarArr2 = xz8.V0;
            xz8VarV0.B(charSequenceK, false);
            messageWriteWidget.q0().setText(null);
        } else {
            bc7[] bc7VarArr3 = MessageWriteWidget.F0;
            yce yceVarW0 = messageWriteWidget.w0();
            yceVarW0.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rceVar.k().toString());
            int i2 = mce.X;
            tce tceVar = new tce(yceVarW0, 0);
            spannableStringBuilder.toString();
            spannableStringBuilder.setSpan(new mce(yceVarW0.c, rceVar, tceVar), 0, spannableStringBuilder.length(), 17);
            CharSequence charSequenceB = ((ida) yceVarW0.A0.getValue()).b(spannableStringBuilder, new nu8(rceVar.a, null, mu8.a, 0, spannableStringBuilder.length(), null), false, true);
            ph4 ph4Var = messageWriteWidget.w0().o;
            sv8 sv8VarQ0 = messageWriteWidget.q0();
            ph4Var.getClass();
            int iIntValue = ((Number) sv8VarQ0.getMessagePosition().getValue()).intValue();
            CharSequence text = sv8VarQ0.getText();
            SpannableString spannableStringValueOf = text != null ? SpannableString.valueOf(text) : null;
            mce mceVarK = spannableStringValueOf != null ? ph4.k(spannableStringValueOf, iIntValue, rceVar) : null;
            qv8 qv8Var = sv8VarQ0.c;
            if (spannableStringValueOf != null && mceVarK != null) {
                int spanStart = spannableStringValueOf.getSpanStart(mceVarK);
                int spanEnd = spannableStringValueOf.getSpanEnd(mceVarK);
                Editable text2 = qv8Var.getText();
                if (text2 != null) {
                    text2.replace(spanStart, spanEnd, charSequenceB, 0, charSequenceB.length());
                }
                Editable text3 = qv8Var.getText();
                if (text3 == null) {
                    sv8VarQ0.setText(" ");
                } else {
                    text3.append((CharSequence) " ");
                }
                e5fVar2 = e5fVar;
            }
            if (e5fVar2 == null) {
                int length = rceVar.X.length();
                Editable text4 = qv8Var.getText();
                if (text4 != null) {
                    int iMax = Math.max(qv8Var.getSelectionStart(), 0);
                    text4.replace(Math.max(iMax - length, 0), iMax, charSequenceB, 0, charSequenceB.length());
                }
                Editable text5 = qv8Var.getText();
                if (text5 == null) {
                    sv8VarQ0.setText(" ");
                } else {
                    text5.append((CharSequence) " ");
                }
            }
        }
        return e5fVar;
    }
}
