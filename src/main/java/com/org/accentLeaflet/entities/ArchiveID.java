package com.org.accentLeaflet.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class ArchiveID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LocalDateTime date ;
	
	private Long id_device ;
	
//	@Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ArchiveID archiveID = (ArchiveID) o;
//        return date.equals(archiveID.date) &&
//                id_device.equals(archiveID.id_device);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(date, id_device);
//    }
	
}
