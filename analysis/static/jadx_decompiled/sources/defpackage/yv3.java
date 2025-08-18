package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class yv3 implements za7, qj3, dwe, InternalIdsResolver.ParticipantPrivateStateModifier, ExternalIdsResolver.ParticipantPrivateStateModifier, ru0, w56, jm7, km7 {
    public final /* synthetic */ int a;

    public /* synthetic */ yv3(int i) {
        this.a = i;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 1:
                ConversationFactory.lambda$hangup$22(obj);
                break;
            default:
                ConversationFactory.lambda$hangup$23((Throwable) obj);
                break;
        }
    }

    @Override // defpackage.w56, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 8:
                long j = ((b04) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            default:
                return zw6.n(Integer.valueOf(((t13) obj).a));
        }
    }

    @Override // defpackage.dwe
    public String c() {
        return ConversationFactory.lambda$joinAnonByLink$15();
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        int i;
        float f;
        int i2;
        float f2;
        int i3;
        boolean z;
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            f = bundle.getFloat(Integer.toString(4, 36));
            i = bundle.getInt(Integer.toString(5, 36));
        } else {
            i = Integer.MIN_VALUE;
            f = -3.4028235E38f;
        }
        int i4 = bundle.containsKey(Integer.toString(6, 36)) ? bundle.getInt(Integer.toString(6, 36)) : Integer.MIN_VALUE;
        float f3 = bundle.containsKey(Integer.toString(7, 36)) ? bundle.getFloat(Integer.toString(7, 36)) : -3.4028235E38f;
        int i5 = bundle.containsKey(Integer.toString(8, 36)) ? bundle.getInt(Integer.toString(8, 36)) : Integer.MIN_VALUE;
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f4 = bundle.getFloat(Integer.toString(10, 36));
            i2 = bundle.getInt(Integer.toString(9, 36));
            f2 = f4;
        } else {
            i2 = Integer.MIN_VALUE;
            f2 = -3.4028235E38f;
        }
        float f5 = bundle.containsKey(Integer.toString(11, 36)) ? bundle.getFloat(Integer.toString(11, 36)) : -3.4028235E38f;
        float f6 = bundle.containsKey(Integer.toString(12, 36)) ? bundle.getFloat(Integer.toString(12, 36)) : -3.4028235E38f;
        if (bundle.containsKey(Integer.toString(13, 36))) {
            i3 = bundle.getInt(Integer.toString(13, 36));
            z = true;
        } else {
            i3 = -16777216;
            z = false;
        }
        return new xz3(charSequence2, alignment2, alignment4, bitmap2, f, i, i4, f3, i5, i2, f2, f5, f6, bundle.getBoolean(Integer.toString(14, 36), false) ? z : false, i3, bundle.containsKey(Integer.toString(15, 36)) ? bundle.getInt(Integer.toString(15, 36)) : Integer.MIN_VALUE, bundle.containsKey(Integer.toString(16, 36)) ? bundle.getFloat(Integer.toString(16, 36)) : 0.0f);
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 10:
                ((u65) obj).getClass();
                break;
            case 11:
                ((u65) obj).getClass();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((gd) obj).getClass();
                break;
            case 13:
                ((u65) obj).getClass();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((u65) obj).getClass();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((u65) obj).getClass();
                break;
            case 16:
                ((u65) obj).getClass();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((gd) obj).getClass();
                break;
            case 18:
                ((u65) obj).getClass();
                break;
            case 19:
                ((u65) obj).getClass();
                break;
            case 20:
                ((gd) obj).getClass();
                break;
            case 21:
                ((u65) obj).getClass();
                break;
            case 22:
                ((u65) obj).getClass();
                break;
            case 23:
                ((u65) obj).getClass();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((u65) obj).getClass();
                break;
            case 25:
                ((u65) obj).getClass();
                break;
            case 26:
                ((u65) obj).getClass();
                break;
            case 27:
                ((gd) obj).getClass();
                break;
            case 28:
                ((gd) obj).getClass();
                break;
            default:
                ((u65) obj).getClass();
                break;
        }
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        switch (this.a) {
            case 0:
                return ConversationFactory.lambda$hangup$21(db7Var);
            default:
                return ConversationParams.parseCallParams(db7Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.id.ExternalIdsResolver.ParticipantPrivateStateModifier
    public void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId) {
        conversationParticipant.setExternalId(participantId);
    }

    @Override // ru.ok.android.externcalls.sdk.id.InternalIdsResolver.ParticipantPrivateStateModifier
    public void setInternalId(ConversationParticipant conversationParticipant, bg1 bg1Var) {
        conversationParticipant.setInternalId(bg1Var);
    }

    public /* synthetic */ yv3(ed edVar, int i, long j, long j2, int i2) {
        this.a = i2;
    }

    public /* synthetic */ yv3(ed edVar, oy5 oy5Var, r54 r54Var) {
        this.a = 11;
    }

    public /* synthetic */ yv3(ed edVar, String str, long j, long j2) {
        this.a = 10;
    }

    public /* synthetic */ yv3(fd fdVar, long j) {
        this.a = 20;
    }

    public /* synthetic */ yv3(fd fdVar, Exception exc) {
        this.a = 12;
    }
}
