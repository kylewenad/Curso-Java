package local.repositories;

import local.entities.MeetingRecord;

public class MeetingRecordDAO extends AbstractDAO<MeetingRecord>{
    public MeetingRecordDAO() {
        super(MeetingRecord.class);
    }
}
