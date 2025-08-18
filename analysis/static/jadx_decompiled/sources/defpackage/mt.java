package defpackage;

import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class mt implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ mt(int i, k56 k56Var) {
        this.a = i;
        this.b = k56Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        int i = this.a;
        k56 k56Var = this.b;
        switch (i) {
            case 0:
                AsrCommandsExecutorImpl.startRecord$lambda$0(k56Var, jSONObject);
                break;
            case 1:
                AsrCommandsExecutorImpl.stopRecord$lambda$2(k56Var, jSONObject);
                break;
            case 2:
                ChatCommandExecutorImpl.sendMessage$lambda$2(k56Var, jSONObject);
                break;
            case 3:
                ConversationFeatureCommandExecutorImpl.enableFeatureForRoles$lambda$0(k56Var, jSONObject);
                break;
            case 4:
                FeedbackCommandsExecutorImpl.sendFeedback$lambda$0(k56Var, jSONObject);
                break;
            case 5:
                MediaMuteCommandExecutorImpl.requestToEnableMedia$lambda$2(k56Var, jSONObject);
                break;
            case 6:
                MediaMuteCommandExecutorImpl.updateMediaOptions$lambda$0(k56Var, jSONObject);
                break;
            case 7:
                ParticipantStatesManagerImpl.lowerHandForAll$lambda$13(k56Var, jSONObject);
                break;
            case 8:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$4(k56Var, jSONObject);
                break;
            case 9:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$6(k56Var, jSONObject);
                break;
            case 10:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$2(k56Var, jSONObject);
                break;
            case 11:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$4(k56Var, jSONObject);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$0(k56Var, jSONObject);
                break;
            case 13:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$2(k56Var, jSONObject);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$4(k56Var, jSONObject);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$0(k56Var, jSONObject);
                break;
            case 16:
                UrlSharingCommandsExecutorImpl.start$lambda$0(k56Var, jSONObject);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                UrlSharingCommandsExecutorImpl.stop$lambda$2(k56Var, jSONObject);
                break;
            case 18:
                WatchTogetherCommandExecutorImpl.resume$lambda$6(k56Var, jSONObject);
                break;
            case 19:
                WatchTogetherCommandExecutorImpl.setVolume_F2PwOSs$lambda$8(k56Var, jSONObject);
                break;
            case 20:
                WatchTogetherCommandExecutorImpl.pause$lambda$4(k56Var, jSONObject);
                break;
            case 21:
                WatchTogetherCommandExecutorImpl.setPosition$lambda$12(k56Var, jSONObject);
                break;
            case 22:
                WatchTogetherCommandExecutorImpl.play_yj_a6ag$lambda$0(k56Var, jSONObject);
                break;
            case 23:
                WatchTogetherCommandExecutorImpl.setMuted$lambda$10(k56Var, jSONObject);
                break;
            default:
                WatchTogetherCommandExecutorImpl.stop$lambda$2(k56Var, jSONObject);
                break;
        }
    }
}
