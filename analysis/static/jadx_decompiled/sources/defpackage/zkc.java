package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class zkc extends v2 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zkc(ilc ilcVar, int i) {
        super(ilcVar);
        this.o = i;
    }

    @Override // defpackage.v2
    public final String g() {
        switch (this.o) {
            case 0:
                return "UPDATE chat_folder SET isHiddenForAllFolder=? WHERE id=?";
            case 1:
                return "DELETE FROM chat_folder";
            case 2:
                return "DELETE FROM chat_folder WHERE id=?";
            case 3:
                return "INSERT OR REPLACE INTO folder_and_chats VALUES (?, ?)";
            case 4:
                return "DELETE FROM folder_and_chats WHERE folderId = ?";
            case 5:
                return "DELETE FROM folder_and_chats";
            case 6:
                return "INSERT OR REPLACE INTO saved_msg_chat(user_id, chat_id) VALUES(?, ?)";
            case 7:
                return "DELETE FROM saved_msg_chat WHERE chat_id = ?";
            case 8:
                return "DELETE FROM saved_msg_chat";
            case 9:
                return "DELETE FROM events";
            case 10:
                return "DELETE FROM sticker_sets";
            case 11:
                return "DELETE FROM stickers";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 13:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "UPDATE tasks SET status = ? WHERE id = ?";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "UPDATE tasks SET data = ? WHERE id = ?";
            case 16:
                return "UPDATE tasks SET data = ?, status = ? WHERE id = ?";
            case LangUtils.HASH_SEED /* 17 */:
                return "UPDATE tasks SET fails_count = fails_count + 1 WHERE id = ?";
            case 18:
                return "DELETE FROM tasks WHERE id = ?";
            case 19:
                return "DELETE FROM tasks";
            case 20:
                return "DELETE FROM tasks WHERE type = ?";
            case 21:
                return "DELETE FROM uploads WHERE path=? AND upload_type=? AND last_modified=?";
            case 22:
                return "DELETE FROM uploads WHERE attach_id=?";
            case 23:
                return "DELETE FROM uploads WHERE photo_token=?";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "DELETE FROM uploads";
            case 25:
                return "DELETE FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?";
            case 26:
                return "DELETE FROM video_conversions";
            case 27:
                return "UPDATE webapp_biometry SET token = ? WHERE user_id = ? AND bot_id = ?";
            case 28:
                return "UPDATE webapp_biometry SET access_requested = ?, access_granted = ? WHERE user_id = ? AND bot_id = ?";
            default:
                return "DELETE FROM webapp_biometry";
        }
    }
}
