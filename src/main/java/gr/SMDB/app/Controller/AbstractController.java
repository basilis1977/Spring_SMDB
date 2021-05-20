package gr.SMDB.app.Controller;

import gr.SMDB.app.Base.AbstractLogEntity;
import gr.SMDB.app.Domain.BaseEntity;
import gr.SMDB.app.Service.BaseService;
import gr.SMDB.app.Transfer.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<T extends BaseEntity> extends AbstractLogEntity {
	protected abstract BaseService<T, Long> getBaseService();

	@GetMapping
	public ResponseEntity<ApiResponse<List<T>>> findAll() {
		return ResponseEntity.ok(ApiResponse.<List<T>>builder().data(getBaseService().findAll()).build());
	}

}
