package defpackage;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class z09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        z09 z09Var = (z09) n((w9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        z09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        z09 z09Var = new z09(continuation, this.Y);
        z09Var.X = obj;
        return z09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        EditText editText;
        Editable text;
        sme smeVarR;
        sme smeVarR2;
        od2.a0(obj);
        w9 w9Var = (w9) this.X;
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().requestFocus();
        xz7 xz7Var = messageWriteWidget.A0;
        if (xz7Var != null) {
            int i = w9Var.a;
            String str = w9Var.c;
            if (str != null && (text = (editText = xz7Var.a).getText()) != null && text.length() != 0) {
                int i2 = w9Var.b;
                ek7[] ek7VarArr = (ek7[]) text.getSpans(i, i2, ek7.class);
                if (ek7VarArr != null && ek7VarArr.length != 0) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= ek7VarArr.length) {
                            break;
                        }
                        int i4 = i3 + 1;
                        try {
                            ek7 ek7Var = ek7VarArr[i3];
                            int spanStart = text.getSpanStart(ek7Var);
                            int spanEnd = text.getSpanEnd(ek7Var);
                            if (spanStart == i && spanEnd == i2) {
                                text.removeSpan(ek7Var);
                                if (editText.isInEditMode()) {
                                    smeVarR2 = ee4.e0;
                                } else {
                                    Context context = editText.getContext();
                                    khe kheVar = sme.a0;
                                    smeVarR2 = fm9.R(context);
                                }
                                ek7 ek7Var2 = new ek7(str, smeVarR2.k);
                                ek7Var2.c = null;
                                ft.B(text, ek7Var2, i, i2);
                            } else {
                                i3 = i4;
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                } else {
                    if (editText.isInEditMode()) {
                        smeVarR = ee4.e0;
                    } else {
                        Context context2 = editText.getContext();
                        khe kheVar2 = sme.a0;
                        smeVarR = fm9.R(context2);
                    }
                    ek7 ek7Var3 = new ek7(str, smeVarR.k);
                    ek7Var3.c = null;
                    ft.B(text, ek7Var3, i, i2);
                }
            }
        }
        return e5f.a;
    }
}
